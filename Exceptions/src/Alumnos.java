public class Alumnos {
    String nombre;
    int edad;

    public Alumnos(String nombre, int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        if (edad < 18) {
            throw new EdadInvalidaException("La edad mínima permitida es 18.");
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "{Nombre: " + nombre + ", edad: " + edad + '}';
    }

    // Java
    public static class EdadInvalidaException extends Exception {
        public EdadInvalidaException() {
            super("Edad inválida: debe ser 18 o mayor.");
        }
        public EdadInvalidaException(String message) {
            super(message);
        }
    }
}