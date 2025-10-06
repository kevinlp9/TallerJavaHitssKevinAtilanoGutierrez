// Java
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alumnos[] registros = new Alumnos[3];

        System.out.print("¿Cuántos alumnos deseas registrar? ");
        int cantidad = sc.nextInt();
        sc.nextLine(); // limpiar salto

        for (int i = 0; i < cantidad; i++) {
            try {
                System.out.printf("Alumno %d - nombre: ", i + 1);
                String nombre = sc.nextLine();

                System.out.printf("Alumno %d - edad: ", i + 1);
                int edad = sc.nextInt();
                sc.nextLine(); // limpiar salto

                // Puede lanzar EdadInvalidaException o IllegalArgumentException
                Alumnos alumno = new Alumnos(nombre, edad);

                // Si i >= 3, esto lanzará ArrayIndexOutOfBoundsException
                registros[i] = alumno;

                System.out.println("Registrado: " + alumno);

            } catch (ArrayIndexOutOfBoundsException ex) {
                System.err.println("Error: no se pueden registrar más de 3 alumnos. (índice fuera de rango)");
                break; // detenemos el registro
            } catch (Alumnos.EdadInvalidaException ex) {
                System.err.println("EdadInvalidaException: " + ex.getMessage());
                i--; // reintentar este mismo índice
            } catch (IllegalArgumentException ex) {
                System.err.println("IllegalArgumentException: " + ex.getMessage());
                i--; // reintentar este mismo índice
            }
        }

        System.out.println("\nAlumnos registrados:");
        for (Alumnos a : registros) {
            if (a != null) {
                System.out.println("- " + a);
            }
        }
    }
}