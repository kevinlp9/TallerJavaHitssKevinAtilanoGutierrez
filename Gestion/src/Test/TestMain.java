package Test;

import Models.Producto;
import Models.Venta;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TestMain {
    private static int ventaCounter = 0;

    public static void main(String[] args) {
        Map<String, Producto> productos = new LinkedHashMap<>();
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("SISTEMA DE GESTION DE PRODUCTOS nike");
        do{
            System.out.println("1. Agregar producto");
            System.out.println("2. Consultar producto por SKU");
            System.out.println("3. Reporte en orden que fueron agregados");
            System.out.println("4. Reporte en orden alfabetico");
            System.out.println("5. Vender producto");
            System.out.println("6. Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el SKU del producto");
                    String sku = sc.next();
                    System.out.println("Ingrese el nombre del producto");
                    String nombre = sc.next();
                    System.out.println("Ingrese la categoria del producto");
                    String categoria = sc.next();
                    System.out.println("Ingrese la cantidad del producto");
                    int cantidad = sc.nextInt();
                    productos.put(sku, new Producto(sku, nombre, categoria, cantidad));
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("Ingrese el SKU del producto a consultar");
                    String skuConsulta = sc.next();
                    if(productos.containsKey(skuConsulta)){
                        System.out.println(productos.get(skuConsulta));
                    }else {
                        System.out.println("Producto no encontrado");
                    }
                    break;
                case 3:
                    System.out.println("Reporte en orden que fueron agregados");
                    for(Producto producto: productos.values()){
                        System.out.println(producto);
                    }
                    break;
                case 4:
                    System.out.println("Reporte en orden alfabetico");
                    productos.values().stream()
                            .sorted((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()))
                            .forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("Ingrese el SKU del producto a vender");
                    String skuVenta = sc.next();
                    if (!productos.containsKey(skuVenta)) {
                        System.out.println("Producto no encontrado");
                        break;
                    }
                    System.out.println("Ingrese el nombre del cliente");
                    String cliente = sc.next();
                    System.out.println("Ingrese la cantidad a vender");
                    int cantidadVenta = sc.nextInt();
                    Producto productoVenta = productos.get(skuVenta);
                    if (productoVenta.getCantidad() < cantidadVenta) {
                        System.out.println("No hay suficiente stock");
                        break;
                    }
                    productoVenta.setCantidad(productoVenta.getCantidad() - cantidadVenta);
                    Venta venta = new Venta(productos.size() + 1, cliente, cantidadVenta);
                    System.out.println("Venta realizada: " + venta);
                    break;

            }
        } while (opcion != 6);
    }
}
