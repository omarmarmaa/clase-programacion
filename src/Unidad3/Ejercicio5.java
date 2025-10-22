package Unidad3;

import java.util.Scanner;

//implementa un método que calcule el maximo de tres números.
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa el primer valor");
        int num1 = scanner.nextInt();
        System.out.println("ingresa el segundo valor");
        int num2 = scanner.nextInt();
        System.out.println("ingresa el tercer valor");
        int num3 = scanner.nextInt();


        scanner.close();
        int numeroMayor = maximo(num1, num2, num3);

        System.out.println("el numero mayor es " + numeroMayor);
    }

    static int maximo(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}
