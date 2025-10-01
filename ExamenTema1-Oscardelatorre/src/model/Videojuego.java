package model;

public class Videojuego {

    private String titulo, desarrollador, clasificacionEdad;
    private int anoLanzamineto;
    private double precio;

    public Videojuego() {
    }

    public Videojuego(String titulo, String desarrollador, String clasificacionEdad, int anoLanzamineto, double precio) {
        this.titulo = titulo;
        this.desarrollador = desarrollador;
        this.clasificacionEdad = clasificacionEdad;
        this.anoLanzamineto = anoLanzamineto;
        this.precio = precio;
    }

    public void cacularPrecioFinal() {
        double precioDescueto = 0;
        precio += precioDescueto;
        System.out.println("Precio final es: " + precioDescueto);
    }

    @Override
    public String toString() {
        System.out.println("titulo = " + titulo);
        System.out.println("desarrollador = " + desarrollador);
        System.out.println("clasificacionEdad = " + clasificacionEdad);
        System.out.println("anoLanzamineto = " + anoLanzamineto);
        System.out.println("precio = " + precio);
        return super.toString();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getClasificacionEdad() {
        return clasificacionEdad;
    }

    public void setClasificacionEdad(String clasificacionEdad) {
        this.clasificacionEdad = clasificacionEdad;
    }

    public int getAnoLanzamineto() {
        return anoLanzamineto;
    }

    public void setAnoLanzamineto(int anoLanzamineto) {
        this.anoLanzamineto = anoLanzamineto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
