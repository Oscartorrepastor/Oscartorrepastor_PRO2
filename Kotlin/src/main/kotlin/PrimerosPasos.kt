fun main() {
    // comentario de linea
    println("Este es mi primer programa kotlin")

    // var -> variables mutables  puede cambiar su valor
    // val -> variables no mutables no pueden cambiar de valor

    //var nombre:String = readln() // String
    /*
    var edad:Int = 24 // Int
    val DNI:String = "123154a"
    lateinit var direcion: String
    var correo:String? = null

    println("Hola mi nombre es $nombre tengo $edad y mi DNI es $DNI")
    println("Mi nombre tiene ${nombre.length} letras")
    correo="correo1@cesjp.com"
    println("Mi correo es ${correo?.length ?: "Sin asisgnar"}")
    direcion = "Alcorcon"
    println("Mi direccion es ${direcion}")
*/
    //saludar(nombre,1)
    println("El resultado de la oprecion es ${sumar(7,8)}")
    sumaFlecha (5 , 7)
   // decidirWhen(6)
    repetirFor()
}

/* Sin valores posicionales */
fun saludar(nombreParam: String, vecesParam: Int = 1) {
    println("Hola $nombreParam, acabas de realizar una funcion")
}

/*Funciones sumar ANY es como funcion object*/

fun sumar(op1: Int , op2: Int): Int{
    return op1 + op2
    // return op1.and(op2)
}

/*Funciones de flecha que no tienen nombre y se asignan variables*/

val sumaFlecha ={ p1: Int , p2: Int -> println("El resultado de la suma es ${p1 + p2}") }
val sumaFlecha2: ((Int, Int)-> Unit)? = { p1: Int , p2: Int -> println("El resultado de la suma es ${p1 + p2}") }

fun decidirWhen(valor: Int){
    println("El valor analizado es: ")
    when(valor){
        1->{println("El caso 1")}
        2->{println("El caso 2")}
        3->{println("El caso 3")}
        4->{println("El caso 4")}
        else -> {println("El caoso no esta en la lista")}
    }
}

fun repetirFor(){
    println("Funcion for")
    for (i in 0 .. 9){println(i)} // estructura for normal
    for (i in 0 .. 9 step 2 ){println(i)} // estructura for normal
    println("Funcion forEach")
    // si la funcion de flecha solo tiene un elemento se llamara con la palabra reservada it
    (10..19).forEach { println(it) } // Estructura forEach
    (10..19).forEachIndexed { index, i -> println("Elemento en posicion ${index} con valor $i") } // Estructura forEach
}