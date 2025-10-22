package Unidad2.ejercicio1;

import java.util.Scanner;

//Escribir un programa en Java que lea un número entero por el teclado
// e imprima todos los números impares menores que él.
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el valor ");
        int numeros = scanner.nextInt();
        for (int i = 1; i <= numeros; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
