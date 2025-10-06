package Test;

import Genericos.ServicioGenerico;
import entidades.Cliente;
import entidades.Estudiante;
import entidades.Factura;
import entidades.Producto;

public class Facturacion {
    public static void main(String[] args) {
        ServicioGenerico<Cliente, String> clienteServicio = new ServicioGenerico<>();
        ServicioGenerico<Producto, Integer> productoServicio = new ServicioGenerico<>();
        ServicioGenerico<Factura, Integer> facturaServicio = new ServicioGenerico<Factura, Integer>();
        ServicioGenerico<Estudiante, Integer> estudianteServicio = new ServicioGenerico<Estudiante, Integer>();

        Cliente c1 = new Cliente("123456789", "Soledad");
        clienteServicio.guardar(c1);
        Cliente c2 = new Cliente("123456789", "Juan");
        Cliente c3 = new Cliente("987654321", "Jose");
        clienteServicio.guardar(c2);

        Producto p1 = new Producto(1, "Libro", 100);
        productoServicio.guardar(p1);
        Producto p2 = new Producto(2, "Libro", 100);
        productoServicio.guardar(p2);

        Factura f1 = new Factura(1, productoServicio.listar(), c1);
        facturaServicio.guardar(f1);
        Factura f2 = new Factura(2, productoServicio.listar(), c2);
        facturaServicio.guardar(f2);
        Factura f3 = new Factura(3, productoServicio.listar(), c3);
        facturaServicio.guardar(f3);

    }
}
