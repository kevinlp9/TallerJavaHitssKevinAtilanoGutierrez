package record;

public class Fruta extends Product{
    private double weight;
    private String color;

    public Fruta(String name, double price, double weight, String color) {
        super(name, price);
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
