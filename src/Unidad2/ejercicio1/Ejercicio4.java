package Unidad2.ejercicio1;

import java.util.Scanner;

//Programa que lea dos números por teclado
// y muestre el resultado de la división del primero por el segundo.
// Se debe comprobar que el divisor no puede ser cero.//
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce el primer valor");
        double primero = scanner.nextDouble();
        System.out.println("introduce el segundo valor");
        double segundo = scanner.nextDouble();

        if (segundo == 0) {
            System.out.println(" no puede ser 0");
        } else {
            System.out.println("el resultado de la division de  " + primero + "/" + segundo + " = " + primero / segundo);
        }
        scanner.close();
    }
}
