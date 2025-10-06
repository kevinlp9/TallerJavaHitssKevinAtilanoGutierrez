package Generics;

import jdk.jshell.execution.Util;

public class Test {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.setValue("Factura");
        System.out.println("Caja contiene: " + box1.getValue());

        Box<Integer> box2 = new Box<>();
        box2.setValue(100);
        System.out.println("Caja contiene: " + box2.getValue());

        System.out.println("Numero máximo es: " + Utils.maximo(400, 30));
        System.out.println("Maximo: " + Utils.maximo("Javassss", "Python"));
    }
}
