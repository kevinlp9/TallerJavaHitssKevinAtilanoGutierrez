package test;

import Models.Empleado;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Empleados {
    public static void main(String args[]) {
        Map<Integer, Empleado> empleados = new HashMap<>();
        empleados.put(1, new Empleado(1, "Kevin", "TI"));
        empleados.put(2, new Empleado(101, "Ann", "Ventas"));
        empleados.put(3, new Empleado(201, "Karla", "Ventas"));
        System.out.println(empleados);

        for (Map.Entry<Integer, Empleado> empleado : empleados.entrySet()) {
            System.out.println(empleado.getKey() + " - " + empleado.getValue());
        }

        System.out.println("Buscar empleado con ID 5");
        System.out.println(empleados.get(5));

        if (empleados.containsKey(5))
            System.out.println("EL empleado existe");
        else
            System.out.println("El empleado no existe");


        empleados.remove(5);
    }
}
