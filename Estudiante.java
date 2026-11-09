public class Estudiante extends MiembroUniversitario {
    private String carrera;

    public Estudiante(String legajo, String nombre, String carrera) {
        super(legajo, nombre);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    @Override
    public String obtenerRol() {
        return "Estudiante de " + carrera;
    }
}