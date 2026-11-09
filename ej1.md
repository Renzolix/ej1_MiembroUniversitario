# Ejercicio 1: MiembroUniversitario

## Explicación Lógica
1. **Clase Abstracta:** `MiembroUniversitario` no puede ser instanciada directamente con el operador `new` porque representa una abstracción general incompleta de la comunidad académica.
2. **Método Abstracto:** `obtenerRol()` obliga a las subclases concretas (`Estudiante` y `Docente`) a sobreescribir e implementar su comportamiento específico.
3. **Reutilización:** Ambas subclases heredan y reutilizan los atributos protegidos `legajo` y `nombre` inicializados en el constructor de la superclase mediante `super(...)`.