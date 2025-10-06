package entidades;

import Genericos.Identificable;

import java.util.List;


public class Factura implements Identificable<Integer> {
    private Integer id;
    private Cliente cliente;
    private List<Producto> productos;

    public Factura(Integer id, List<Producto> productos, Cliente cliente) {
        this.id = id;
        this.productos = productos;
        this.cliente = cliente;
    }

    public Integer getId(){
        return id;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public List<Producto> getProductos(){
        return productos;
    }

    public void agregarElemento(Producto producto){
       productos.add(producto);
        System.out.println("Elemento agregado");
    }

    public void eliminarElemento(Producto producto){
        productos.remove(producto);
        System.out.println("Elemento eliminado");
    }

    public double calcularTotal(){
        double total = 0;
        for(Producto producto : productos){
            total += producto.getPrecio();
        }
        return total;
    }

    
    
    @Override
    public String toString() {
        return "{" +
                "id: '" + id + '\'' +
                ", cliente: '" + cliente + '\'' +
                ", productos: '" + productos + ", Total: " + calcularTotal() + '\'' +
                '}';
    }

    public String generarTicket() {
        StringBuilder ticket = new StringBuilder();
        ticket.append("=====================================\n");
        ticket.append("           TICKET DE VENTA          \n");
        ticket.append("=====================================\n");
        ticket.append("Factura #: ").append(id).append("\n");
        ticket.append("Cliente: ").append(cliente.getNombre()).append("\n");
        ticket.append("=====================================\n");
        ticket.append("Productos:\n");
        for (Producto producto : productos) {
            ticket.append(String.format("%-20s $%.2f%n",
                    producto.getDescripcion(),
                    producto.getPrecio()));
        }
        ticket.append("=====================================\n");
        ticket.append(String.format("TOTAL: $%.2f%n", calcularTotal()));
        ticket.append("=====================================\n");
        return ticket.toString();
    }
}
