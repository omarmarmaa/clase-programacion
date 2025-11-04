package Unidad2.ejercicio2.practicar;

import java.util.Scanner;

public class ejercicioMedioDiamante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        for (int i = 1; i <= numero; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" " + " " + "*");
            }
            System.out.println();
        }

    }
}
