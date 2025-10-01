package model;

public class Estrategia extends Videojuego {

    private int complejidad, duracionPartida;

    public Estrategia() {
    }

    public Estrategia(String titulo, String desarrollador, String clasificacionEdad, int anoLanzamineto, double precio, int complejidad, int duracionPartida) {
        super(titulo, desarrollador, clasificacionEdad, anoLanzamineto, precio);
        this.complejidad = complejidad;
        this.duracionPartida = duracionPartida;
    }


    public void cacularPrecioFinal() {
        if (complejidad > 3) {
            setPrecio(getPrecio() * 0.03);
        }
    }

    @Override
    public String toString() {
        return "Estrategia{" +
                "complejidad=" + complejidad +
                ", duracionPartida=" + duracionPartida +
                '}';
    }

    public int getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(int complejidad) {
        this.complejidad = complejidad;
    }

    public int getDuracionPartida() {
        return duracionPartida;
    }

    public void setDuracionPartida(int duracionPartida) {
        this.duracionPartida = duracionPartida;
    }
}
