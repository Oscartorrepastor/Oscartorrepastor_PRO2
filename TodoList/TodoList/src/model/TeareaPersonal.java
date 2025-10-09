package model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TeareaPersonal extends Tarea{

    private String ubicacion;

    public TeareaPersonal() {
    }

    public TeareaPersonal(String titulo, String descripcion, boolean prioritario, int numeroPersonas, String ubicacion){
        super(titulo,descripcion,prioritario,numeroPersonas);
        this.ubicacion = ubicacion;
    }

    public TeareaPersonal(String titulo, String descripcion, int numeroPersonas, String ubicacion) {
        super(titulo, descripcion, numeroPersonas);
        this.ubicacion = ubicacion;
    }





    @Override
    public void enviarAviso() {
        System.out.println("Enviar otro recordatorio");
    }

    @Override
    public String toString() {
        return super.toString() + "TeareaPersonal{" +
                "ubicacion='" + ubicacion + '\'' +
                '}';
    }
}
