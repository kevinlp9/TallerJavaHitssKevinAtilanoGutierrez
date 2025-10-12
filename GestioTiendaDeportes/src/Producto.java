import java.util.HashMap;
import java.util.Map;

public class Producto {
    String sku;
    String nombre;
    String categoria;
    Map<String, Integer> stock; // stock por sucursal

    public Producto(String sku, String nombre, String categoria) {
        this.sku = sku;
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = new HashMap<>();
    }

    public void actualizarStock(String sucursal, int cantidad) {
        stock.put(sucursal, stock.getOrDefault(sucursal, 0) + cantidad);
    }

    @Override
    public String toString() {
        return "SKU: " + sku + ", Nombre: " + nombre + ", Categoria: " + categoria + ", Stock: " + stock;
    }
}

