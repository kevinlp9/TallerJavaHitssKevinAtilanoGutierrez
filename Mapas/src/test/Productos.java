package test;

import Models.Producto;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Productos {
    public static void main(String[] args) {
        Map<String, Producto> inventario = new LinkedHashMap<>();
        inventario.put("P001", new Producto("P001", "laptop", 5));
        inventario.put("P002", new Producto("P002", "laptop", 10));
        inventario.put("P003", new Producto("P003", "laptop", 15));

        String clave = "P002";
        if(inventario.containsKey(clave)) {
            inventario.get(clave).setQuantity(10);
        }

        for (Map.Entry<String, Producto> entry : inventario.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("Eliminando");
        System.out.println("Producto eliminado " + inventario.remove("P003"));

        inventario.put("P004",  new Producto("P004", "laptop", 5));

    }
}
