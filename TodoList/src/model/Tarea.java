package model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;

@Setter
@Getter
public abstract class Tarea {

    // variable

    private String titulo, descripcion;
    private boolean prioritario, completada;
    private Persona[] encargados;
    private ArrayList<Encargos> listaTarea;

    // Constructores

    public Tarea() {
    }

    public Tarea(String titulo, String descripcion, boolean prioritario, int numeroPersonas) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioritario = prioritario;
        encargados = new Persona[numeroPersonas];
        listaTarea = new ArrayList<>();
        // completada = false;
    }

    public Tarea(String titulo, String descripcion, int numeroPersonas) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        encargados = new Persona[numeroPersonas];
        listaTarea = new ArrayList<>();
        // completada = false;
        // prioritario = false
    }

    //metodos

    // Cada tarea puede asignar una persona
    // solo de podra asignar una persona si hay hueco disponible
    // cada vez que se asigne una persona se debera colocar en el primer hueco disponible

    abstract public void enviarAviso();

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

    // crear metodo que permite agregar un encargo
    // los encargos deben tener ID unico --> Poner aviso

    public void agregarEncargo(Encargos encargos) {
        if (estaEncargo(encargos.getId()) != null) {
            System.out.println("Error en el proceso, no se pudo agregar");
        } else {
            for (int i = 0; i < listaTarea.size(); i++) {
                listaTarea.add(encargos);
            }
            System.out.println("Encargo agregado correctamente");
        }
    }

    // crear metodo que permite eliminar encargo
    // para ello se pide id del encargo y se quita de la listar --> Poner aviso

    public void eliminarEncargo(int id) {
        if (estaEncargo(id) != null) {
            listaTarea.remove(estaEncargo(id));
            System.out.println("Encargo eliminado correctamente");
        } else {
            System.out.println("No esta en la lista el id especificado");
        }
    }

    private Encargos estaEncargo(int id) {
        for (Encargos encargos : listaTarea) {
            if (encargos.getId() == id) {
                return encargos;
            }
        }
        return null;
    }

    public void buscarEncargoId(int id){
        if (estaEncargo(id) != null) {
            estaEncargo(id).mostrarDatos();
        }
    }

    // Listar todos los encargas de una tarea

    public void listarEncargos() {
        for (Encargos encargos : listaTarea) {
            encargos.mostrarDatos();
        }
    }

    // Completar un encargo  -> pasar su variable a true

    public boolean completarEncargo(int id) {
        if (estaEncargo(id) != null && !estaEncargo(id).isCompleta()) {
            estaEncargo(id).setCompleta(true);
            System.out.println("El encargo se completo con exito");
            return true;
        }else {
            System.out.println("No se pudo completar o no esta en la lista");
            return false;
        }
    }

    // Mostrar un encargo que estan completado

    public void listarEncargoCompletado(){
        for (Encargos encargos : listaTarea) {
            encargos.mostrarDatos();
        }
    }

    // Completar una tarea -> Una tarea quedara completa si todos los encargos estan completos

    public void completarTerea(){
        for (Encargos encargo: listaTarea) {
            if (!encargo.isCompleta()) {
                System.out.println("No se puede completar la tarea");
                return;
            }
        }
        completada = true;
        System.out.println("tarea completada con exito");
    }

    public void mostarEncagados() {
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
        } else {
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

    @Override
    public String toString() {
        return "Tarea{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", prioritario=" + prioritario +
                ", completada=" + completada +
                ", encargados=" + Arrays.toString(encargados) +
                ", listaTarea=" + listaTarea +
                '}';
    }
}
