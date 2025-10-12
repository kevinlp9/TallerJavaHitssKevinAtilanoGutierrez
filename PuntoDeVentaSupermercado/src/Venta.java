import java.util.List;

public class Venta {
    int id;
    Cliente cliente;
    Empleado empleado;
    List<Producto> productos;
    double total;

    public Venta(int id, Cliente cliente, Empleado empleado, List<Producto> productos) {
        this.id = id;
        this.cliente = cliente;
        this.empleado = empleado;
        this.productos = productos;
    }
}
