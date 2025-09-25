package model


fun Ejercicio1() {

    val listaNombre = Array(5) { " " }
    for (i in listaNombre.indices) {
        print("Escribe los nomres ${i + 1}: ")
        val nombre = readln()
        listaNombre[i] = nombre ?: " "
    }

    println("Los compñeros son: ")
    for (nombre in listaNombre)
        println(nombre)
}

fun Ejercicio2() {

// Crear un array de tamaño 20 para la serie de Fibonacci
    val fibonacci = IntArray(20)
    // Inicializar los dos primeros valores
    fibonacci[0] = 0
    fibonacci[1] = 1

    // Calcular el resto de la serie
    for (i in 2 until fibonacci.size) {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]
    }

    // Mostrar los 20 números en la consola
    println("Serie de Fibonacci (20 primeros números):")
    for (num in fibonacci) {
        println(num)
    }

}

fun Ejercicio3(){

}
