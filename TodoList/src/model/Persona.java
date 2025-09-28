package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Persona {

    private String Nombre, apellido, DNI;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String DNI, int edad) {
        Nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + Nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", DNI='" + DNI + '\'' +
                ", edad=" + edad +
                '}';
    }
}
