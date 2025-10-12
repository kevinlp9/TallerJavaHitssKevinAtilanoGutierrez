package models;

import java.time.LocalDate;

public class Venta {
    private String idVenta;
    private Cliente cliente;
    private Libro libro;
    private LocalDate fecha;

    public Venta(String idVenta, Cliente cliente, Libro libro) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.libro = libro;
        this.fecha = LocalDate.now();
    }

    public double getPrecio() { return libro.getPrecio(); }
    public Libro getLibro() { return libro; }

    public String factura() {
        return "Factura #" + idVenta + "\nCliente: " + cliente.getNombre() +
                "\nLibro: " + libro.resumen() + "\nFecha: " + fecha + "\nTotal: $" + libro.getPrecio();
    }
}
