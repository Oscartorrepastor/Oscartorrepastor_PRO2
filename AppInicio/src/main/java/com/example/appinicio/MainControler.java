package com.example.appinicio;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MainControler implements Initializable {
    @FXML
    private Button botonPulsar, botonVaciar, botonLimpiar;
    @FXML
    private Label labelSaludo;
    @FXML
    private TextField textFieldNombre;

    private DropShadow sombra;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Ejecutado directamente en la asocion de la stage
        instancias();
        initGUI();
        acciones();

    }

    private void initGUI() {
        // Personalizar la parte grafica
        //botonPulsar.setEffect(sombra);

    }

    private void instancias() {
        sombra = new DropShadow();

    }

    private void acciones() {
        /*
        botonVaciar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {


            }
        });
        botonPulsar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                // Al pulsar el boton se capture el texto del textField y se muestre en el label
                // el mensaje sw "Enorabuena Oscar has completado el primer ejercicio
                //System.out.println("Has pulsado el boton");



            }
        });
*/
        botonPulsar.setOnAction(new ManejoAcccion());
        botonVaciar.setOnAction(new ManejoAcccion());

        botonPulsar.setOnMouseEntered(new ManejoRaton());
        botonPulsar.setOnMousePressed(new ManejoRaton());
        botonPulsar.setOnMouseReleased(new ManejoRaton());

        botonVaciar.setOnMouseEntered(new ManejoRaton());
        botonVaciar.setOnMousePressed(new ManejoRaton());
        botonVaciar.setOnMouseReleased(new ManejoRaton());

        botonPulsar.setOnMouseEntered(new ManejoEfectos());
        botonPulsar.setOnMouseExited(new ManejoEfectos());
        botonVaciar.setOnMouseEntered(new ManejoEfectos());
        botonVaciar.setOnMouseExited(new ManejoEfectos());

        botonLimpiar.addEventHandler(ActionEvent.ACTION, new ManejoAcccion());

    }


    class ManejoAcccion implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent actionEvent) {
            System.out.println("Has pulsado el boton desde una clase externa");
            // Que boton se ha pulsado?
            if (actionEvent.getSource() == botonPulsar) {
                String nombre = textFieldNombre.getText();
                if (nombre.isBlank()) {
                    System.out.println("Por favor introduce un nombre");
                } else {
                    labelSaludo.setText("Enhorabuena " + nombre + " has completado el primer ejercicio");
                    textFieldNombre.clear();
                }
                System.out.println("Has pulsado el boton pulsar");
            } else if (actionEvent.getSource() == botonVaciar) {
                textFieldNombre.clear();
                labelSaludo.setText("Coño que no lo he enchufado");
                System.out.println("Has pulsado el boton vaciar");
            } else if (actionEvent.getSource() == botonLimpiar) {
                textFieldNombre.clear();
            }
        }
    }

    class ManejoEfectos implements EventHandler<MouseEvent> {

        @Override
        public void handle(MouseEvent mouseEvent) {

            if (mouseEvent.getEventType() == MouseEvent.MOUSE_ENTERED) {
                ((Button) mouseEvent.getSource()).setEffect(sombra);
            } else if (mouseEvent.getEventType() == MouseEvent.MOUSE_EXITED) {
                ((Button) mouseEvent.getSource()).setEffect(null);
            }

        }
    }

    class ManejoRaton implements EventHandler<MouseEvent> {

        @Override
        public void handle(MouseEvent mouseEvent) {

            if (mouseEvent.getEventType() == MouseEvent.MOUSE_ENTERED) {
                ((Button) mouseEvent.getSource()).setCursor(Cursor.OPEN_HAND);
            } else if (mouseEvent.getEventType() == MouseEvent.MOUSE_PRESSED) {
                ((Button) mouseEvent.getSource()).setCursor(Cursor.CLOSED_HAND);
            } else if (mouseEvent.getEventType() == MouseEvent.MOUSE_RELEASED) {
                ((Button) mouseEvent.getSource()).setCursor(Cursor.OPEN_HAND);
            } else if (mouseEvent.getEventType() == MouseEvent.MOUSE_EXITED) {
                ((Button) mouseEvent.getSource()).setCursor(Cursor.CLOSED_HAND);
            }

        }
    }
}