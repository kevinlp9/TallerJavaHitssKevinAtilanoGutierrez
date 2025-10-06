package Models;

public class Product {

    private String description;
    private double price;

    public Product(String description){
        this.description = description;
        this.price = 0;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }


    @Override
    public String toString(){
        return "{description: " + description + ", price: " + price + "}";
    }


}
