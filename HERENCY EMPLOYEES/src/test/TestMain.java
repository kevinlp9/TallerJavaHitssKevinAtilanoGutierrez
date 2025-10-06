package test;
import classes.Cliente;
import classes.Empleado;
import classes.Gerente;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("=== ============ ===\n");

        Gerente gerente1 = new Gerente("Laura", "García", "AJDAI378",
                "Francisco Villa 5", 85000.0, 1001, 500000.0);

        System.out.println("GERENTE CREADO:");
        System.out.println(gerente1.toString());
        System.out.println();

        Empleado empleado1 = new Empleado("Carlos", "López", "KDYU2983",
                "Calle Secundaria 456", 45000.0, 2001);

        Empleado empleado2 = new Empleado("María", "Rodríguez", "HKWUWB88",
                "Boulevard Norte 789", 38000.0, 2002);

        System.out.println("EMPLEADOS CREADOS:");
        System.out.println(empleado1.toString());
        System.out.println("\n" + empleado2.toString());
        System.out.println();

        Cliente cliente1 = new Cliente("Pedro", "Martínez", "HABDJS88",
                "Zona Industrial 321", 3001);

        System.out.println("CLIENTE CREADO:");
        System.out.println(cliente1.toString());
        System.out.println();

        System.out.println("=== AUMENTOS DE REMUNERACIÓN ===");
        System.out.println("Remuneración original de Carlos: $" +
                String.format("%.2f", empleado1.getRemuneracion()));
        empleado1.aumentarRemuneracion(10);
        System.out.println("Nueva remuneración de Carlos: $" +
                String.format("%.2f", empleado1.getRemuneracion()));
        System.out.println();

        System.out.println("Remuneración original del Gerente: $" +
                String.format("%.2f", gerente1.getRemuneracion()));
        gerente1.aumentarRemuneracion(15);
        System.out.println("Nueva remuneración del Gerente: $" +
                String.format("%.2f", gerente1.getRemuneracion()));
        System.out.println();

        System.out.println("=== DATOS ACTUALIZADOS ===");
        System.out.println("GERENTE:");
        System.out.println(gerente1.toString());
        System.out.println("\nEMPLEADO 1:");
        System.out.println(empleado1.toString());
        System.out.println("\nEMPLEADO 2:");
        System.out.println(empleado2.toString());
        System.out.println("\nCLIENTE:");
        System.out.println(cliente1.toString());
    }
}