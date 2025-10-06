package Models;

public class Producto {
    private String code;
    private String name;
    private int quantity;

    public Producto(String code, String name, int quantity) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
