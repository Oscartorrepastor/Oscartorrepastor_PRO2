package model;



import java.util.Date;


public class TareaProfesional extends Tarea{

    private int presupuesto;
    private Date fechaLimite;

    public TareaProfesional() {
    }

    public TareaProfesional(String tareaP1, String descripcion, boolean b, int i, int i1, Date date){}
    public TareaProfesional(String titulo, String descripcion, int numeroPersonas, int presupuesto , Date fechaLimite){
        super(titulo, descripcion, numeroPersonas);
        this.presupuesto = presupuesto;
        this.fechaLimite = fechaLimite;

    }


    @Override
    public void enviarAviso() {
        for (Persona persona: getEncargados()){
            if (persona != null) {
                System.out.printf("%s recuerda que complementar %d tareas pendientes\n", persona.getNombre(), getListaTarea().size());
            }
        }
    }

    @Override
    public String toString() {
        return super.toString()+ "TareaProfesional{" +
                "presupuesto=" + presupuesto +
                ", fechaLimite=" + fechaLimite +
                '}';
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }
}
