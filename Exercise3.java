package Ciclos;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        double notas, notas6=0, notas5=0, notas1=0;
        double promtotal=0;
        Scanner sc = new Scanner(System.in);
        //contador para cantidad de calificaciones
        //sobre la cual vamos a calcular el promedio
        int j=0, k=0, l=0;
        for (int i=1; i<=20; i++){
            System.out.println("Ingresa la nota: " + i);
            notas=sc.nextDouble();
            promtotal+=notas;
                if (notas>=6 && notas<=10){
                    //si la nota cumple las condiciones se agrega a la suma
                    notas6+=notas;
                    //y se incrementa el contador para saber sobre cuanto se debe promediar
                    j++;
                } else if (notas<6 && notas>1) {
                    notas5+=notas;
                    k++;
                } else if (notas==1) {
                    notas1+=notas;
                    l++;
                } else {
                    //si no cumplen las condiciones se cierra
                    return;
                }
            }
        sc.close();
        System.out.println("La cantidad de notas mayores e iguales a 6 es: " + j + " y el promedio es: " + notas6/j);
        System.out.println("La cantidad de notas menores a 6 es: " + k + " y el promedio es: " + notas5/k );
        System.out.println("La cantidad de notas iguales a 1 es: " + l + " y el promedio es: " + notas1/l);
        System.out.println("El promedio total es: " + promtotal/20);
        }
    }

