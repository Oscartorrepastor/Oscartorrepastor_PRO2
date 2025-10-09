package model

abstract class Administrador(var id : Int, var nombre : String) {
    var clave: Int = 1234
    constructor(id: Int, nombre: String,  clave: Int): this(id, nombre){
        this.clave=clave
    }

    fun empezarLiga(){
        println("Introduce la clave para empezar la liga:")
        clave = readLine()!!.toInt()
        if (clave == 1234) {
            println("Liga empezada")
        } else {
            println("Clave incorrecta")
        }
    }
   open fun mostrarDatos() {
        println("ID: $id")
        println("Nombre: $nombre")
    }
}