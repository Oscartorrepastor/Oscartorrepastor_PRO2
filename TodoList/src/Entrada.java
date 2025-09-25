import model.Encargos;
import model.Persona;
import model.Tarea;

public class Entrada {
    public static void main(String[] args) {
        Tarea tarea = new Tarea("Practicas DI" , "Esta practica de DI",4);

        //tarea.asignarResponsable(new Persona("nombre1", "apellido1", "124a", 43));
        //tarea.asignarResponsable(new Persona("nombre2", "apellido2", "144a", 35));
        //tarea.asignarResponsable(new Persona("nombre2", "apellido2", "145a", 21));

        tarea.agregarEncargo(new Encargos("Planificar la entrega" , 1));
        tarea.agregarEncargo(new Encargos("Codificar la practica" , 2));
        tarea.agregarEncargo(new Encargos("Planificar la entrega" , 3));
        tarea.agregarEncargo(new Encargos("Planificar la entrega" , 4));

        tarea.eliminarEncargo(4);

        tarea.agregarEncargo(new Encargos("Planificar la entrega" , 4));

        tarea.listarEncargos();

        //System.out.printf("Esta tarea tiene %d", tarea.getListaTarea().size());
    }
}
