package Models;

public class Producto {
    private String sku;
    private String nombre;
    private String categoria;
    private int cantidad;

    public Producto(String sku, String nombre, String categoria, int cantidad) {
        this.sku = sku;
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "{" +
                "sku: '" + sku + '\'' +
                ", nombre: '" + nombre + '\'' +
                ", categoria: '" + categoria + '\'' +
                ", cantidad: " + cantidad +
                '}';
    }
}
