package model;

public class Tarea {

    // variable

    private String titulo, descripcion;
    private boolean prioritario, completada;
    private Persona[] encargados;

    // Constructores

    public Tarea() {
    }

    public Tarea(String titulo, String descripcion, boolean prioritario, int numeroPersonas) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioritario = prioritario;
        encargados = new Persona[numeroPersonas];
        // completada = false;
    }

    public Tarea(String titulo, String descripcion, int numeroPersonas) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        encargados = new Persona[numeroPersonas];
        // completada = false;
        // prioritario = false
    }

    //metodos

    // Cada tarea puede asignar una persona
    // solo de podra asignar una persona si hay hueco disponible
    // cada vez que se asigne una persona se debera colocar en el primer hueco disponible


    public void asignarResponsable(Persona persona) {
        for (int i = 0; i < encargados.length; i++) {
            if (encargados[i] == null) {
                encargados[i] = persona;
                System.out.println("Persona agreagada");
                return;
            }
        }
        System.out.println("No hay huco disponible, tarea completa");
    }

    public void eliminarResponsable(String dni) {
        for (Persona persona : encargados) {
            if (persona != null && persona.getDNI().equalsIgnoreCase(dni)) {
                persona = null;
                System.out.println("Persona eliminada");
                return;
            }
        }
        System.out.printf("La persona con DNI %s no esta en esta tarea %n", dni);
    }

    public void mostraDatos() {
        int num = 0;
        for (Persona persona : encargados) {
            if (persona == null) {
                num++;
            } else {
                System.out.println(persona);
            }
        }
        if (num == encargados.length) {
            System.out.println("No hay responsables asignados");
        } else if (num > 0) {
            System.out.printf("Hay %d huecos disponibles%n", num);
        } else{
            System.out.println("Todos los responsbles estan hubicados");
        }
    }

    public boolean verDni(String dni) {
        for (Persona persona : encargados) {
            if (persona != null && persona.getDNI().equalsIgnoreCase(dni)) {
                System.out.println("El dni ya esta registrado no puedes meter esta persona");
                return true;
            }
        }
        return false;
    }


    //getter y setters

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isPrioritario() {
        return prioritario;
    }

    public void setPrioritario(boolean prioritario) {
        this.prioritario = prioritario;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
