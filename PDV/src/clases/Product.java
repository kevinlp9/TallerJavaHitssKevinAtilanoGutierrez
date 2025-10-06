package clases;

public class Product {
    private final int id;
    private String nombre;
    private double precio;
    
    private static int contador;
    
    public Product(String nombre, double precio) {
        this.id = ++contador;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Product.contador = contador;
    }

    @Override
    public String toString() {
        return "{" +
                "id: " + id +
                ", nombre: '" + nombre + '\'' +
                ", precio: " + precio +
                '}';
    }
}
