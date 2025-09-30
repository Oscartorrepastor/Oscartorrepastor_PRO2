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
                        if (tarea instanceof TareaProfesional) {
                            System.out.println("Encargos de una tarea profesional:");
                            tarea.listarEncargos();
                        } else if (tarea instanceof TeareaPersonal) {
                            System.out.println("Encargos de una tarea personal:");
                            tarea.listarEncargos();
                        } else {
                            System.out.println("No hay nada en esa opción");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Que ID de encargo quieres completar");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    boolean encontrado = false;
                    for (Tarea tarea : tareas) {
                        if (tarea.completarEncargo(id)) {
                            System.out.println("Encargo " + id + " completado.");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontró ningún encargo con ese ID.");
                    }
                    break;
                case 5:
                    for (Tarea tarea : tareas) {
                        if (tarea.isCompletada()) {
                            if (tarea instanceof TareaProfesional) {
                                System.out.println("[Profesional] " + tarea);
                            } else if (tarea instanceof TeareaPersonal) {
                                System.out.println("[Personal] " + tarea);
                            }
                        }
                    }
                    break;
                case 6:
                    for (Tarea tarea : tareas) {
                        if (!tarea.isCompletada()) {
                            if (tarea instanceof TareaProfesional) {
                                System.out.println("[Profesional] " + tarea);
                            } else if (tarea instanceof TeareaPersonal) {
                                System.out.println("[Personal] " + tarea);
                            }
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
