package Ciclos;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int monto, opcion, montototal=0;
        do{
            System.out.println("Ingrese el valor de la opcion");
            System.out.println("1. Registrar pedido ");
            System.out.println("2. Mostrar el total de ventas");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el monto del pedido");
                    monto = sc.nextInt();
                    if (monto>=0){
                        montototal+=monto;
                    }else {
                        System.out.println("El monto no puede ser negativo");
                        return;
                    }
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("El total de ventas es: " + montototal);
                    break;
            }
        }while(opcion!=3);
        System.out.println("Has salido con exito");
        sc.close();
    }

}
