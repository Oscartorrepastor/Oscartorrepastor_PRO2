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


}