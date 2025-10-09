package controler;

import model.Accion;
import model.Estrategia;
import model.Rpg;
import model.Videojuego;

import java.util.ArrayList;

public class Plataforma {
    Videojuego videojuego = new Videojuego();
    ArrayList<Videojuego> lista;

    public Plataforma() {
        this.lista = new ArrayList<>();
    }

    public void anadirJuego(Videojuego videojuego) {
        if (videojuego instanceof Accion) {
            lista.add(videojuego);
        } else if (videojuego instanceof Estrategia) {
            lista.add(videojuego);
        } else if (videojuego instanceof Rpg) {
            lista.add(videojuego);
        }
    }

    public void eliminar(String titulo) {
        if (titulo.equalsIgnoreCase(videojuego.getTitulo())) {
            lista.remove(videojuego);
        }
    }

    public void odenarPrecio() {
        for (Videojuego item : lista) {
            if (item.getPrecio() > 0) {
                item.toString();
            }
        }
    }

    public void filtroEdad(String edad) {
        for (Videojuego item : lista) {
            if (edad.equalsIgnoreCase(videojuego.getClasificacionEdad())) {
                System.out.println(item);
            }
        }
    }

    public void calcualarPrecio() {
        videojuego.cacularPrecioFinal();
    }

    public void listaJuego(String tipo, Videojuego videojuego) {
        if (videojuego instanceof Accion) {
            videojuego.toString();
        } else if (videojuego instanceof Estrategia) {
            videojuego.toString();
        } else if (videojuego instanceof Rpg) {
            videojuego.toString();
        }
    }

    public void mostrar() {
        for (Videojuego videojuego1 : lista) {
            if (videojuego1 instanceof Accion) {
                System.out.println(videojuego1);
            } else if (videojuego1 instanceof Estrategia) {
                System.out.println(videojuego1);
            } else if (videojuego1 instanceof Rpg) {
                System.out.println(videojuego1);
            }
        }
    }
}
