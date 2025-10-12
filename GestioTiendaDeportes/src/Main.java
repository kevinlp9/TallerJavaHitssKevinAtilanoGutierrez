public class Main {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        Producto p1 = new Producto("A001", "Balon Futbol", "Futbol");
        Producto p2 = new Producto("A002", "Camiseta Running", "Running");
        Producto p3 = new Producto("A003", "Tenis Basket", "Basket");

        inv.registrarProducto(p1);
        inv.registrarProducto(p2);
        inv.registrarProducto(p3);

        inv.actualizarStock("A001", "Sucursal Norte", 10);
        inv.actualizarStock("A002", "Sucursal Centro", 5);
        inv.actualizarStock("A003", "Sucursal Sur", 7);

        System.out.println("Consulta SKU A002:");
        System.out.println(inv.consultarProducto("A002"));

        System.out.println("\n Reporte por orden de inserción:");
        inv.reporteInsercion().forEach(System.out::println);

        System.out.println("\n Reporte alfabético:");
        inv.reporteAlfabetico().forEach(System.out::println);
    }
}