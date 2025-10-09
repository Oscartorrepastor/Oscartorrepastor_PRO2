package controler

import model.Jugador
import model.Participante

class Fantasy {
 var conjuntoJugadores = ArrayList<Participante>()


    fun buscarId(id: Int): Participante? {
        for (jugador in conjuntoJugadores) {
            if (jugador.id == id) {
                return jugador
            }
        }
        return null
    }

    fun recorrerParticiipantes(participantes: Participante) {
        participantes.plantilla.forEach {
            println("ID: ${it.id}, Nombre: ${it.nombre}")
        }
    }

    fun liga(){
        conjuntoJugadores.forEach { it.puntos  }
    }



}