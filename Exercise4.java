package Ciclos;

import java.util.Scanner;

public class Exercise4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
        System.out.println("Seleccione una opcion");
            System.out.println("1. Actualizar");
            System.out.println("2. Eliminar");
            System.out.println("3. Crear");
            System.out.println("4. Listar");
            System.out.println("5. Salir");
        opcion = sc.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Usuario actualizado correctamente");
                break;
            case 2:
                System.out.println("Usuario eliminado correctamente");
                break;
            case 3:
                System.out.println("Usuario creado correctamente");
                break;
            case 4:
                System.out.println("Usuarios listados correctamente");
                break;
            }

        }while (opcion!=5);
        System.out.println("Has salido con exito");
        sc.close();
    }
}
