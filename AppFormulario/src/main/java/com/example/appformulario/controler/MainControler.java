package com.example.appformulario.controler;

import com.example.appformulario.HelloApplication;
import com.example.appformulario.model.Usuario;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainControler implements Initializable {
    @FXML
    private Button botonAgregar, botonEliminar, botonDetalle;

    @FXML
    private ToggleButton botonLista;

    @FXML
    private CheckBox chekBox;

    @FXML
    private ComboBox<Integer> comboBox;

    @FXML
    private ListView<Usuario> listView;

    @FXML
    private BorderPane panelGeneral;

    @FXML
    private GridPane panelDerecha;

    @FXML
    private RadioButton radioB1, radioB2;

    @FXML
    private TextField text1, text2, text3;

    private ToggleGroup grupoRadio;
    private ObservableList<Integer> listaCombo;
    private ObservableList<Usuario> listaUsuarios;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        instancias();
        initGUI();
        acciones();
    }

    private void acciones() {
        botonDetalle.setOnAction(new ManejoAciones());
        botonAgregar.setOnAction(new ManejoAciones());
        botonEliminar.setOnAction(new ManejoAciones());
        chekBox.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(javafx.beans.value.ObservableValue<? extends Boolean> observableValue, Boolean oldValue, Boolean newValue) {
                botonAgregar.setDisable(!newValue);
            }
        });
        botonLista.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (t1) {
                    panelGeneral.setRight(panelDerecha);
                } else {
                    panelGeneral.setRight(null);
                }
            }
        });

    }

    private void instancias() {
        grupoRadio = new ToggleGroup();
        grupoRadio.getToggles().addAll(radioB1, radioB2);
        listaCombo = FXCollections.observableArrayList();
        for (int i = 18; i < 91; i++) {
            listaCombo.add(i);
        }
        listaUsuarios = FXCollections.observableArrayList();
    }

    private void initGUI() {
        listView.setItems(listaUsuarios);
        comboBox.setItems(listaCombo);
        botonAgregar.setDisable(!chekBox.isDisable());
        if (botonLista.isSelected()) {
            panelGeneral.setRight(panelDerecha);

        } else {
            panelGeneral.setRight(null);
        }

    }

    private void limpiarFormulario() {
        text1.clear();
        text2.clear();
        text3.clear();
        grupoRadio.selectToggle(null);
        chekBox.setSelected(false);
        comboBox.getSelectionModel().clearSelection();
    }

    private Usuario estaUsuario(String correo) {
        for (Usuario ususario : listaUsuarios) {
            if (ususario.getCorreo().equalsIgnoreCase(correo)) {
                return ususario;
            }
        }
        return null;
    }

    class ManejoAciones implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent actionEvent) {
            if (actionEvent.getSource() == botonAgregar) {
                System.out.println("Presionaste el boton agregar");

                if (!text1.getText().isEmpty()
                        && !text2.getText().isEmpty()
                        && !text3.getText().isEmpty()
                        && grupoRadio.getSelectedToggle() != null
                        && comboBox.getSelectionModel().getSelectedItem() >= 0) {

                    String nombre = text1.getText();
                    String correo = text2.getText();
                    String localidad = text3.getText();
                    String genero = ((RadioButton) grupoRadio.getSelectedToggle()).getText();
                    boolean disponible = chekBox.isSelected();
                    Integer edad = comboBox.getSelectionModel().getSelectedItem();

                    if (estaUsuario(correo) != null) {
                        System.out.println("El usuario ya existe");
                    } else {
                        Usuario usuario = new Usuario(nombre, correo, localidad, genero, disponible, edad);
                        listaUsuarios.add(usuario);
                        limpiarFormulario();
                    }

                } else {
                    System.out.println("Faltan datos por llenar");
                }

            } else if (actionEvent.getSource() == botonEliminar) {
                if (listView.getSelectionModel().getSelectedIndex() != -1) {
                    listaUsuarios.remove(listView.getSelectionModel().getSelectedIndex());
                } else {
                    Stage ventana = new Stage();
                    try {
                        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Dialgo-view.fxml"));
                        Scene scene = new Scene(loader.load());
                        ventana.setScene(scene);
                        ventana.setTitle("Diálogo de información");
                        ventana.setResizable(false);
                        ventana.initModality(Modality.APPLICATION_MODAL);
                        ventana.showAndWait();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            } else if (actionEvent.getSource() == botonDetalle) {

                int posicionSelecionada = listView.getSelectionModel().getSelectedIndex();
                Usuario usuarioSeleccionado = listView.getSelectionModel().getSelectedItem();

                if (posicionSelecionada != -1) {
                    Stage ventanaDetalle = new Stage();
                    try {
                        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("detalle-view.fxml"));
                        Parent root = loader.load();
                        Scene scene = new Scene(root);
                        ventanaDetalle.setScene(scene);

                        ventanaDetalle.initModality(Modality.APPLICATION_MODAL);
                        ventanaDetalle.setTitle("Detalle de Usuario");
                        ventanaDetalle.setResizable(false);
                        DialgoControler controler = loader.getController();
                        controler.setUsuario(usuarioSeleccionado);
                        ventanaDetalle.showAndWait();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

        }
    }
}

