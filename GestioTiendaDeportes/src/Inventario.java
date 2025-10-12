import java.util.*;

public class Inventario {
    private Map<String, Producto> porSku;
    private List<Producto> ordenInsercion;
    private List<Producto> ordenNombre;

    public Inventario() {
        porSku = new HashMap<>();
        ordenInsercion = new ArrayList<>();
        ordenNombre = new ArrayList<>();
    }

    public void registrarProducto(Producto producto) {
        porSku.put(producto.sku, producto);
        ordenInsercion.add(producto);

        int pos = Collections.binarySearch(ordenNombre, producto, Comparator.comparing(p -> p.nombre));
        if (pos < 0) pos = -(pos + 1);
        ordenNombre.add(pos, producto);
    }

    public Producto consultarProducto(String sku) {
        return porSku.get(sku);
    }

    public List<Producto> reporteInsercion() {
        return ordenInsercion;
    }

    public List<Producto> reporteAlfabetico() {
        return ordenNombre;
    }

    public void actualizarStock(String sku, String sucursal, int cantidad) {
        Producto p = porSku.get(sku);
        if (p != null) {
            p.actualizarStock(sucursal, cantidad);
        }
    }
}
