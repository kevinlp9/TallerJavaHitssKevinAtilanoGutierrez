package Ciclos;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, num2, res=0;
        System.out.println("Ingrese el numero 1");
        num = sc.nextInt();
        System.out.println("Ingrese el numero 2");
        num2 = sc.nextInt();
        //convertimos a valor absoluto
        int a=Math.abs(num);
        int b=Math.abs(num2);
        //realizamos la multiplicacion
        for (int i=1; i<=b; i++){
                res=res+a;
        }
        //si es negativo agregamos un signo negativo
        if (((num < 0 && num2 > 0) || (num > 0 && num2 < 0))){
            System.out.println("El resultado es: " + (-res));
        }else {
            System.out.println("El resultado es: " + res);
        }
        sc.close();
    }
}
