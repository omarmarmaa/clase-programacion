package Unidad2.ejercicio1;

import java.util.Scanner;

//Mostrar la tabla de multiplicar de un número.
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor: ");
        int numero = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + numero * i);
        }

        scanner.close();
    }
}
