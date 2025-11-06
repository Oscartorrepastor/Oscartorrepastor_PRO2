package com.example.appformulario.model;

import javafx.scene.control.RadioButton;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

@Data

public class Usuario {

    private String nombre;
    private String correo;
    private String localidad;
    private String genero;
    private boolean disponible;
    private Integer edad;


    public Usuario() {
    }

    public Usuario(String nombre, String correo, String localidad, String genero, boolean disponible, Integer edad) {
        this.nombre = nombre;
        this.correo = correo;
        this.localidad = localidad;
        this.genero = genero;
        this.disponible = disponible;
        this.edad = edad;
    }

    @Override
    public String
    toString() {
        return nombre;
    }
}
