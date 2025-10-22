package Unidad2.ejercicio2;

import java.util.Scanner;

//Desarrolla un programa que pida un número por teclado y te muestre el número de cifras que tiene.
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int cifras;

        if (numero == 0) {
            cifras = 1;
        } else {
            cifras = 0;
            int nCifras = Math.abs(numero);
            while (nCifras > 0) {
                nCifras = nCifras / 10;
                cifras++;
            }
            System.out.println(cifras);
        }

    }
}
