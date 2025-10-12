package models;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private static final int MIN_EDAD = 18;
    private String nombre;
    private int edad;
    private List<Venta> historialCompras = new ArrayList<>();

    public Cliente(String nombre, int edad) {
        if (edad < MIN_EDAD) throw new IllegalArgumentException("Debe ser mayor de edad");
        this.nombre = nombre;
        this.edad = edad;
    }

    public void agregarCompra(Venta venta) {
        historialCompras.add(venta);
    }

    public String getNombre() { return nombre; }
    public List<Venta> getHistorialCompras() { return historialCompras; }
}
