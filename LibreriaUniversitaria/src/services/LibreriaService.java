package services;

import models.*;
import utils.GeneradorID;
import java.util.*;

public class LibreriaService {
    private List<Libro> libros = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Venta> ventas = new ArrayList<>();

    public Libro agregarLibro(String titulo, String autor, int anio, double precio) {
        Libro libro = new Libro(GeneradorID.generar(), titulo, autor, anio, precio);
        libros.add(libro);
        return libro;
    }

    public Cliente agregarCliente(String nombre, int edad) {
        Cliente cliente = new Cliente(nombre, edad);
        clientes.add(cliente);
        return cliente;
    }

    public Venta venderLibro(Cliente cliente, Libro libro) {
        Venta venta = new Venta(GeneradorID.generar(), cliente, libro);
        ventas.add(venta);
        cliente.agregarCompra(venta);
        return venta;
    }

    public double promedioPrecios() {
        return libros.stream().mapToDouble(Libro::getPrecio).average().orElse(0);
    }

    public Libro libroMasCaro() {
        return libros.stream().max(Comparator.comparingDouble(Libro::getPrecio)).orElse(null);
    }
}
