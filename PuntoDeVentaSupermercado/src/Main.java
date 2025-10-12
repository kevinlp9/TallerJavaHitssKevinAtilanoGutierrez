import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SupermercadoService service = new SupermercadoService();

        List<Producto> inventario = Arrays.asList(
                new Producto(1, "Leche", 25, 3),
                new Producto(2, "Pan", 15, 10),
                new Producto(3, "Huevos", 40, 2)
        );

        Cliente cliente = new Cliente(1, "Carlos", "VIP");
        Empleado empleado = new Empleado(1, "Laura", "Cajera");

        Venta venta = new Venta(1, cliente, empleado, inventario);
        venta.total = service.calcularTotal.apply(inventario);

        System.out.println("Productos con stock bajo:");
        inventario.stream().filter(service.stockBajo).forEach(System.out::println);

        service.generarTicket.accept(cliente, venta);
        service.notificarCompra.accept(cliente, empleado);

        System.out.println("¿Aplica descuento VIP?: " + service.clienteConDescuento.test(cliente, venta));

        System.out.println("Producto más caro entre leche y huevos: " +
                service.masCaro.apply(inventario.get(0), inventario.get(2)));
    }
}
