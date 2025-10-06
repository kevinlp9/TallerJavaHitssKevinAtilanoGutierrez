package record;

public class Lacteo extends Product{
    private int quantity;
    private int proteinas;

    public Lacteo(String name, double price, int quantity, int proteinas) {
        super(name, price);
        this.quantity = quantity;
        this.proteinas = proteinas;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getProteinas() {
        return proteinas;
    }

}
