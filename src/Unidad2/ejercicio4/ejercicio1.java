package Unidad2.ejercicio4;

import java.util.Scanner;

//Implementa un método recursivo que determine si un número es primo.
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean resultado = primo(a, 2);
        if (resultado) {
            System.out.println("primo " + a);
        } else {
            System.out.println("no primo " + a);
        }
        scanner.close();
    }

    public static boolean primo(int a, int b) {
        if (a <= 1) {
            return false;
        } else if (b * b > a) {
            return true;
        } else if (a % b == 0) {
            return false;
        }
        return primo(a, b + 1);
    }
}
