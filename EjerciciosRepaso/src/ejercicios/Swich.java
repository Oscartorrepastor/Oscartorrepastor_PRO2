package ejercicios;

import java.util.Scanner;

public class Swich {
    Scanner scanner = new Scanner(System.in);
    public void Ejercicio1(){
        System.out.println("Dime una letra");
        char letra = scanner.next().toLowerCase().charAt(0);
        switch (letra){
            case 'a':
                System.out.println("Vocal");
                break;
            case 'e':
                System.out.println("Vocal");
                break;
            case 'i':
                System.out.println("Vocal");
                break;
            case 'o':
                System.out.println("Vocal");
                break;
            case 'u':
                System.out.println("Vocal");
                break;
            default:
                System.out.println("Consonate");
        }
    }

    public void Ejercicio2(){

        System.out.println("Dime algun numero para ver si es par o impar");
        int num = scanner.nextInt();

        switch (Math.abs(num)%2){
            case 0:
                System.out.println("El nuemero es par");
                break;
            default:
                System.out.println("El numero es impar");
        }
    }

    public void Ejercicio3(){
        System.out.println("Dime dos numero que quieras operar");
        int num = scanner.nextInt();
        int num2 = scanner.nextInt();

        int op = 0;
        do {
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("Que operacion quieres hacer");
            op = scanner.nextInt();
            switch (op){
                case 1:
                    System.out.println("Suma de nuemro 1 con numero 2" + (num + num2));
                    break;
                case 2:
                    System.out.println("Resta de nuemro 1 con numero 2" + (num - num2));
                    break;
                case 3:
                    System.out.println("Multiplicacion de nuemro 1 con numero 2" + (num * num2));
                    break;
                case 4:
                    System.out.println("Division de nuemro 1 con numero 2" + (num / num2));
                    break;
                default:
                    System.out.println("Saliendo del programa");
            }
        } while (op!=5);
    }

    public void Ejercicio4(){
        System.out.println("Dime un numero del 1 al 12");
        int num=scanner.nextInt();
        switch(num){
            case 12: case 1: case 2: System.out.println("Invierno"); break;
            case 3: case 4: case 5: System.out.println("Primavera"); break;
            case 6: case 7: case 8: System.out.println("Verano"); break;
            case 9: case 10: case 11: System.out.println("Otoño"); break;
            default: System.out.println("Mes inválido");
        }
    }

    public void Ejercicio5(){
        String codigo=scanner.next();
        switch(codigo){
            case "P001":
                System.out.println("Producto: Lápiz, Precio: 0,50€");
                break;
            case "P002":
                System.out.println("Producto: Cuaderno, Precio: 2,00€");
                break;
            case "P003":
                System.out.println("Producto: Bolígrafo, Precio: 1,20€");
                break;
            default:
                System.out.println("Código no reconocido");
        }

    }
}
