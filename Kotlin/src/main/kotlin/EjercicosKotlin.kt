fun main() {
    ejercicio2()
}

// 1. Escribe un programa que lea un número entero y que indique si es par o impar.

fun ejercicio1(){
    println("Introduce un numero: ")
    var num: Int = readln().toInt()
    if (num % 2==0){
        println("El numero es par")
    }else{println("El numero es impar")}
}

// 2. Escribe un programa que lea un número entero y que indique si es positivo, negativo o cero.

fun ejercicio2(){
    println("Introduce un numero: ")
    var num: Int = readln().toInt()
    if (num ==0){
        println("El numero es 0")
    } else if (num > 0) {
        println("El numero es positivo")
    }else println("El nuemro es negativo")
}

// 3. Escribe un programa que lea un número entero y que indique si es primo o no.



// 4. Escribe un programa que lea un número entero y que muestre por pantalla todos los números primos menores o iguales al número leído.


// 5. Escribe un programa que lea un número entero y que calcule el factorial de ese número.


// 6. Escribe un programa que lea un número entero y que calcule la suma de los primeros N números naturales.


// 7. Escribe un programa que lea un número entero y que calcule la suma de los dígitos de ese número.