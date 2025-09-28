import model.TareaProfesional;
import model.TeareaPersonal;

import java.util.Date;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TeareaPersonal teareaPersonal = new TeareaPersonal();
        TareaProfesional tareaProfesional = new TareaProfesional();
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
            switch (opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Slaiendo...");
                    break;

            }
        }while (opcion != 7);
    }
}
