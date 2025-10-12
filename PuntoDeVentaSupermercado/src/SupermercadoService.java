import java.util.List;
import java.util.function.*;

public class SupermercadoService {

    public Predicate<Producto> stockBajo = p -> p.stock < 5;

    public Function<List<Producto>, Double> calcularTotal =
            lista -> lista.stream().mapToDouble(p -> p.precio).sum();

    public Consumer<Venta> imprimirVenta = v -> {
        System.out.println("Venta #" + v.id);
        v.productos.forEach(p -> System.out.println("- " + p));
        System.out.println("TOTAL: $" + v.total);
    };

    public Supplier<Producto> productoMuestra = () -> new Producto(999, "Producto Demo", 9.99, 10);

    public UnaryOperator<Producto> aplicarDescuento = p -> {
        p.precio *= 0.9;
        return p;
    };

    public BinaryOperator<Producto> masCaro = (p1, p2) -> p1.precio >= p2.precio ? p1 : p2;

    public BiPredicate<Cliente, Venta> clienteConDescuento =
            (c, v) -> c.tipo.equals("VIP") && v.total > 1000;

    public BiConsumer<Cliente, Venta> generarTicket = (c, v) -> {
        System.out.println("==== TICKET ====");
        System.out.println("Cliente: " + c.nombre + " (" + c.tipo + ")");
        v.productos.forEach(p -> System.out.println("* " + p.nombre + " - $" + p.precio));
        System.out.println("TOTAL: $" + v.total);
    };

    public BiConsumer<Cliente, Empleado> notificarCompra =
            (c, e) -> System.out.println("Cliente " + c.nombre +
                    ", su compra fue procesada por " + e.nombre);
}
