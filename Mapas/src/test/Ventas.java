package test;

import Models.Venta;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;
import java.time.LocalDate;

public class Ventas {
    public static void main(String[] args){
        Map<LocalDate, Venta> ventas = new TreeMap<>();
        ventas.put(LocalDate.of(23, 9, 12),
                new Venta(3, "Susana", 3));
        ventas.put(LocalDate.of(23, 9, 12),
                new Venta(3, "Kevin", 3));
        ventas.put(LocalDate.of(23, 9, 12),
                new Venta(3, "Kevin", 3));


        for (Map.Entry<LocalDate, Venta> entry : ventas.entrySet()) {
            System.out.println(entry.getKey() +  " - " + entry.getValue());
        }

        System.out.println("Ventas antes del ");
            for (Map.Entry<LocalDate, Venta> ventaAnterior : ((TreeMap<LocalDate, Venta>) ventas).headMap(LocalDate.of(2025, 9, 12)).entrySet);

    }
}
