package Unidad2.ejercicio2;

import java.util.Scanner;

//Crea un programa en el que introduzcas una nota del 1 al 10 y te indique su nota en formato escrito
// (insuficiente, suficiente, etc.).
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce  una nota ");
        double nota = scanner.nextDouble();

        if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota == 5) {
            System.out.println("Suficiente");
        } else if (nota == 6) {
            System.out.println("Bien");
        } else if (nota == 7) {
            System.out.println("Notable");
        } else if (nota == 8) {
            System.out.println("Notable");
        } else if (nota == 9) {
            System.out.println("Sobresaliente");
        } else if (nota == 10) {
            System.out.println("Sobresaliente");
        }
    }
}
