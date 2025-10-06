package test;

import clases.Product;
import clases.Sale;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("--------------Productos-------------------");
        Product p1 = new Product("Leche", 29.50);
        System.out.println(p1);
        Product p2 = new Product("Cookies", 15.50);
        System.out.println(p2);

        System.out.println("----------------Ventas---------------------");
        Sale s1 = new Sale(p1, 5);
        System.out.println(s1);
        Sale s2 = new Sale(p2, 7);
        System.out.println(s2);

        Sale s3 = new Sale(new Product("Pan", 20.5), 5);
        System.out.println(s3);
    }

}
