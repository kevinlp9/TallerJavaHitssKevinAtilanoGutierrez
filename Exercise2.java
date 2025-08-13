package Ciclos;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        int cantidad, num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite la cantidad de numeros: ");
        cantidad = sc.nextInt();
        if (cantidad < 10) {
            System.out.println("Numero invalido");
            return;
        }

        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            num = sc.nextInt();

            if (num < menor) {
                menor = num;
            }
        }

        if (menor < 10) {
            System.out.println("El número menor es " + menor + " y es menor a 10.");
        } else {
            System.out.println("El número menor es " + menor + " y es mayor o igual a 10.");
        }

        sc.close();
    }
}
