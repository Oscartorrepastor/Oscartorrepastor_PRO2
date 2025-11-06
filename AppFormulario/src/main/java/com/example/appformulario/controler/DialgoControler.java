package com.example.appformulario.controler;

import com.example.appformulario.model.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class DialgoControler implements Initializable {


    @FXML
    private Label textEdad, textGenero, textLocal, textMail, textNombre;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public void setUsuario(Usuario usuario){
        textNombre.setText(usuario.getNombre());
        textMail.setText(usuario.getCorreo());
        textLocal.setText(usuario.getLocalidad());
        textEdad.setText(usuario.getEdad().toString());
        textGenero.setText(usuario.getGenero());
    }
}
