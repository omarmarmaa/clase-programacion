package Unidad2.ejercicio2;

import java.util.Scanner;

//desarrolla un programa que solicite un número n y luego muestre por pantalla la siguiente figura:
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
//………….
//1 2 3 4 5 …..n
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }
    }
}
