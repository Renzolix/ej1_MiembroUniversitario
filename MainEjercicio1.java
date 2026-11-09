public class MainEjercicio1 {
    public static void main(String[] args) {
        // La siguiente línea provocaría un error de compilación:
        // MiembroUniversitario m = new MiembroUniversitario("101", "Renzo"); 
        // Error: MiembroUniversitario is abstract; cannot be instantiated

        Estudiante estudiante = new Estudiante("EST-4592", "Renzo Gonzalez", "Tecnicatura en Desarrollo de Software");
        Docente docente = new Docente("DOC-1020", "María Fernández", "Exclusiva");

        System.out.println("--- Miembros Universitarios ---");
        System.out.println("Nombre: " + estudiante.getNombre() + " | Legajo: " + estudiante.getLegajo() + " | Rol: " + estudiante.obtenerRol());
        System.out.println("Nombre: " + docente.getNombre() + " | Legajo: " + docente.getLegajo() + " | Rol: " + docente.obtenerRol());
    }
}