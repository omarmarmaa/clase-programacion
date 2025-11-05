package Unidad2.ejercicio3;

import java.util.Scanner;

//Implementa un método que calcule el mayor entre tres números.
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de la primera opcion");
        int opcion1 = scanner.nextInt();
        System.out.println("Ingrese el valor de la segunda opcion");
        int opcion2 = scanner.nextInt();
        System.out.println("Ingrese el valor de la tercera opcion");
        int opcion3 = scanner.nextInt();

        mayor(opcion1, opcion2, opcion3);
        scanner.close();
    }

    public static void mayor(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else
            System.out.println(c);
    }
}

