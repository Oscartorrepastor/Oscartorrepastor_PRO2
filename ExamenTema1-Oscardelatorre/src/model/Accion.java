package model;

public class Accion extends Videojuego {
    private int nivelViolencia;
    private boolean modoMulti;

    public Accion() {
    }

    public Accion(String titulo, String desarrollador, String clasificacionEdad, int anoLanzamineto, double precio, int nivelViolencia, boolean modoMulti) {
        super(titulo, desarrollador, clasificacionEdad, anoLanzamineto, precio);
        this.nivelViolencia = nivelViolencia;
        this.modoMulti = modoMulti;
    }

    public void calcularPrecioFinal() {
        if (nivelViolencia > 3) {
           if (modoMulti == true){
               setPrecio(getPrecio()*0.15);
            }else {
               setPrecio(getPrecio()*0.03);
           }
        }
    }

    @Override
    public String toString() {
        return "Accion{" +
                "nivelViolencia=" + nivelViolencia +
                ", modoMulti=" + modoMulti +
                '}';
    }

    public int getNivelViolencia() {
        return nivelViolencia;
    }

    public void setNivelViolencia(int nivelViolencia) {
        this.nivelViolencia = nivelViolencia;
    }

    public boolean isModoMulti() {
        return modoMulti;
    }

    public void setModoMulti(boolean modoMulti) {
        this.modoMulti = modoMulti;
    }
}
