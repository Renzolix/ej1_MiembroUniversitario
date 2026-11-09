public class Docente extends MiembroUniversitario {
    private String dedicacion;

    public Docente(String legajo, String nombre, String dedicacion) {
        super(legajo, nombre);
        this.dedicacion = dedicacion;
    }

    public String getDedicacion() {
        return dedicacion;
    }

    @Override
    public String obtenerRol() {
        return "Docente con dedicación " + dedicacion;
    }
}