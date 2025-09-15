package ejercicios;

import java.util.Scanner;

public class Ejercicios {
    Scanner scanner = new Scanner(System.in);
    public void Ejercicio1(){
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Los nuemeros son iguales");
        }else if (num1 > num2){
            System.out.println("El primer numero es mayor que el segundo");
        }else {
            System.out.println("El primer numero es menor que el segundo");
        }

    }

    public void Ejercicio2(){
        int num = scanner.nextInt();
        boolean multiplo = num % 20 ==0;
        boolean rango = num >= -100 && num <= 100;
        if (multiplo && rango) {
            System.out.println("Es multiplo de 20 y esta en rango");
        } else if (multiplo) {
            System.out.println("Es multiplo de 20 y no esta en rango");
        } else if (rango) {
            System.out.println("No es multiplo de 20 y esta en rango");
        }else {
            System.out.println("no es multiplo de 20 y no esta en rango");
        }
    }

    public void Ejercicio3(){
        System.out.println("Dime un numero de 4 cifras");
        int num = scanner.nextInt();
        if ( num < 1000 || num > 9999) {
            System.out.println("El numero no tiene 4 cifras");
        }
        int val = num % 10, val1 = (num / 10) % 10 , val2 = (num/100) % 10, val3 = num /1000;
        if (val == val3 && val1 == val2) {
            System.out.println("El numero es capicua");
        }else {
            System.out.println("Error no es capicua");
        }
    }

    public void Ejercicio4(){
        System.out.println("Dime un numero");
        int num = scanner.nextInt();
        if (num %2 ==0)num++; else num--;
        System.out.println(num);
    }

    public void Ejercicio5(){
        System.out.println("Introduce un numero");
        int num = scanner.nextInt();
        int resto = num;
        if (num %2 == 0) resto +=2;
        if (num %3 == 0) resto +=3;
        if (num %5 == 0) resto +=5;
        if (resto == num) resto+=1;
        System.out.println(resto);
    }

    public void Ejercicio6(){

        

    }

}
