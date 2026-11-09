public abstract class MiembroUniversitario {
    protected String legajo;
    protected String nombre;

    public MiembroUniversitario(String legajo, String nombre) {
        this.legajo = legajo;
        this.nombre = nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    // Método abstracto que obliga a las subclases a definir su rol
    public abstract String obtenerRol();
}