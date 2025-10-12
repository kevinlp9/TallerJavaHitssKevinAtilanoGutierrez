import models.*;
import services.LibreriaService;

public class Main {
    public static void main(String[] args) {
        LibreriaService libreria = new LibreriaService();

        Libro l1 = libreria.agregarLibro("Java Avanzado", "Juan Pérez", 2010, 500);
        Cliente c1 = libreria.agregarCliente("Carlos", 22);

        Venta v = libreria.venderLibro(c1, l1);
        System.out.println(v.factura());
        System.out.println("Libro más caro: " + libreria.libroMasCaro().resumen());
        System.out.println("Promedio precios: " + libreria.promedioPrecios());
    }
}
