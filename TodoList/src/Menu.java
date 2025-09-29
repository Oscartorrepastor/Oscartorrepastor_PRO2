import model.Encargos;
import model.Tarea;
import model.TareaProfesional;
import model.TeareaPersonal;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TeareaPersonal teareaPersonal = new TeareaPersonal("TareaPe2", "descripcion", 2,
                "Alcorcon");
        TareaProfesional tareaProfesional = new TareaProfesional("TareaP1",
                "descripcion", true,
                5, 100000, new Date());
        Encargos encargos = new Encargos();
        ArrayList<Tarea> tareas = new ArrayList<>();
        int opcion = 0;
        do {
            System.out.println("1. Registrar Tarea");
            System.out.println("2. Modificar Tarea");
            System.out.println("3. Listar Tarea");
            System.out.println("4. Completar Tarea");
            System.out.println("5. Listar Completas");
            System.out.println("6. Listar Incompletas");
            System.out.println("7. Salir");

            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Que tipo de tarea quieres agregar 1 para tarea personal 2 para tarea profesional");
                    int num = scanner.nextInt();
                    scanner.nextLine();
                    if (num == 1) {
                        tareas.add(teareaPersonal);
                        //teareaPersonal.agregarEncargo(new Encargos("ejemplo", 1));
                        System.out.println("Dime que tarea tiene que hacer");
                        String des = scanner.nextLine();
                        System.out.println("Que id tiene esa tarea");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        teareaPersonal.agregarEncargo(new Encargos(des, id));

                    } else if (num == 2) {
                        tareas.add(tareaProfesional);
                        //tareaProfesional.agregarEncargo(new Encargos("ejemplo", 1));
                        System.out.println("Dime que tarea tiene que hacer");
                        String des = scanner.nextLine();
                        System.out.println("Que id tiene esa tarea");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        tareaProfesional.agregarEncargo(new Encargos(des, id));

                    } else
                        System.out.println("No se puede hacer esa opcion");
                    break;
                case 2:
                    break;
                case 3:
                    for (Tarea tarea : tareas) {
                        tarea.listarEncargos();
                    }
                    break;
                case 4:
                    System.out.println("Que ID quieres buscar");
                    int id = scanner.nextInt();
                    for (Tarea tarea : tareas) {
                        if (id == encargos.getId()) {
                            tarea.completarTerea();
                        }
                    }
                    break;
                case 5:
                    for (Tarea tarea : tareas) {
                        if (tarea.isCompletada()) {
                            tarea.toString();
                        }
                    }
                    break;
                case 6:
                    for (Tarea tarea : tareas) {
                        if (!tarea.isCompletada()) {
                            tarea.toString();
                        }
                    }
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;

            }
        } while (opcion != 7);
    }
}
