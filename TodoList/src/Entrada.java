import model.Persona;
import model.Tarea;

public class Entrada {
    public static void main(String[] args) {
        Tarea tarea = new Tarea("Practicas DI" , "Esta practica de DI",4);

        tarea.asignarResponsable(new Persona("nombre1", "apellido1", "124a", 43));
        tarea.asignarResponsable(new Persona("nombre2", "apellido2", "124a", 35));
    }
}
