import model.*;

import java.util.ArrayList;
import java.util.Date;

public class Entrada {
    public static void main(String[] args) {
        //Tarea tarea = new Tarea("Practicas DI" , "Esta practica de DI",4);

        //tarea.asignarResponsable(new Persona("nombre1", "apellido1", "124a", 43));
        //tarea.asignarResponsable(new Persona("nombre2", "apellido2", "144a", 35));
        //tarea.asignarResponsable(new Persona("nombre2", "apellido2", "145a", 21));

        //tarea.agregarEncargo(new Encargos("Planificar la entrega" , 1));
        //tarea.agregarEncargo(new Encargos("Codificar la practica" , 2));
        //tarea.agregarEncargo(new Encargos("Planificar la entrega" , 3));
        //tarea.agregarEncargo(new Encargos("Planificar la entrega" , 4));

        //tarea.eliminarEncargo(4);

        //tarea.agregarEncargo(new Encargos("Planificar la entrega" , 4));

        //tarea.listarEncargos();

        TareaProfesional tareaProfesional = new TareaProfesional("TareaP1",
                "descripcion", true,
                5, 100000, new Date());
        tareaProfesional.asignarResponsable(new Persona("123A", "Borja", "Martin", 12));
        tareaProfesional.asignarResponsable(new Persona("123B", "Juan", "Martin", 12));
        tareaProfesional.agregarEncargo(new Encargos("ejemplo",1));
        tareaProfesional.agregarEncargo(new Encargos("ejemplo",2));
        tareaProfesional.agregarEncargo(new Encargos("ejemplo",3));
        tareaProfesional.agregarEncargo(new Encargos("ejemplo",4));

        TeareaPersonal tareaPersonal = new TeareaPersonal("TareaPe2", "descripcion", 2,
                "Alcorcon");

        TeareaPersonal teareaPersonal = new TeareaPersonal();

        ArrayList<Tarea> tareas = new ArrayList<>();

        tareas.add(tareaProfesional);
        tareas.add(teareaPersonal);

        for (Tarea tarea1 : tareas){
            tarea1.enviarAviso();
            // instanof para preguntar si puede o es intancia de otra clase
            // Pudes tratar interfaces es como una herncia enmascarada

        }

        //System.out.printf("Esta tarea tiene %d", tarea.getListaTarea().size());
    }
}
