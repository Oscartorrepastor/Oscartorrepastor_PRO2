package model;

public class Rpg extends Videojuego{

    private boolean mundoAbierto;
    private int horasHistoriaPrincipal;

    public Rpg() {
    }

    public Rpg(String titulo, String desarrollador, String clasificacionEdad, int anoLanzamineto, double precio, boolean mundoAbierto, int horasHistoriaPrincipal) {
        super(titulo, desarrollador, clasificacionEdad, anoLanzamineto, precio);
        this.mundoAbierto = mundoAbierto;
        this.horasHistoriaPrincipal = horasHistoriaPrincipal;
    }


    public void cacularPrecioFinal() {
        if (horasHistoriaPrincipal > 10) {
            if (mundoAbierto == true && horasHistoriaPrincipal>10){
                setPrecio(getPrecio()*0.17);
            }else {
                setPrecio(getPrecio()*0.02);
            }
            setPrecio(getPrecio()*0.02);
        }
    }

    @Override
    public String toString() {
        return "Rpg{" +
                "mundoAbierto=" + mundoAbierto +
                ", horasHistoriaPrincipal=" + horasHistoriaPrincipal +
                '}';
    }

    public boolean isMundoAbierto() {
        return mundoAbierto;
    }

    public void setMundoAbierto(boolean mundoAbierto) {
        this.mundoAbierto = mundoAbierto;
    }

    public int getHorasHistoriaPrincipal() {
        return horasHistoriaPrincipal;
    }

    public void setHorasHistoriaPrincipal(int horasHistoriaPrincipal) {
        this.horasHistoriaPrincipal = horasHistoriaPrincipal;
    }
}
