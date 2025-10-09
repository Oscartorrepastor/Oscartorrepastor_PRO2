package model

class Participante(
    id: Int,
    nombre: String,
    var puntos: Int,
    var presupuesto: Int
) : Administrador(id, nombre) {
    lateinit var plantilla: ArrayList<Jugador>



    fun ficharJugador(jugador: Jugador) {
        if (jugador.valor > presupuesto) {
            println("No tienes suficiente presupuesto para fichar a este jugador.")
        } else if (plantilla.size >= 6) {
            println("No se pueden añadir más jugadores, la plantilla está llena.")
        } else {
            plantilla.add(jugador)
            presupuesto -= jugador.valor
            println("Jugador fichado. Presupuesto restante: $presupuesto")
        }
    }


    fun disposicionEquipo(){
        println("Disposición del equipo:")
        println("Porteros: ${plantilla.count { it.posicion == "Portero" }}")
        println("Defensas: ${plantilla.count { it.posicion == "Defensa" }}")
        println("Mediocentros: ${plantilla.count { it.posicion == "Mediocentro" }}")
        println("Delanteros: ${plantilla.count { it.posicion == "Delantero" }}")
    }

    override fun mostrarDatos() {
        super.mostrarDatos()
        println("Puntos: $puntos")
        println("Presupuesto: $presupuesto")
    }
}