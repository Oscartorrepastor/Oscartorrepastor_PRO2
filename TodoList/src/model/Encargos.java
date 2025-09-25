package model;

import lombok.Getter;
import lombok.Setter;


public class Encargos {

    @Getter
    private int id;
    @Setter
    private String descripcion;
    private boolean completa;

    public Encargos() {
    }

    public Encargos(String descripcion, int id) {
        this.descripcion = descripcion;
        this.id = id;
    }

    // un encargo debe tener un responsable

    public void mostrarDatos(){
        System.out.println("id = " + id);
        System.out.println("descripcion = " + descripcion);
        System.out.println("completa = " + completa);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompleta() {
        return completa;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }
}