package clases;

public class Sale {
    private final int id;
    private Product product;
    private int quantity;
    private static int contador;

    public Sale(Product product, int quantity) {
        this.id = ++contador;
        this.product = product;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static int getContador() {
        return contador;
    }

   public double getSubtotal() {
        return product.getPrecio() * quantity;
   }

    @Override
    public String toString() {
        return "{" +
                "id: " + id +
                ", product: " + product +
                ", quantity: " + quantity +
                ", SubTotal: " + getSubtotal() +
                '}';
    }
}
