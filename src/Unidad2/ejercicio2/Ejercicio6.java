package Unidad2.ejercicio2;

import java.util.Scanner;

//Realiza una aplicación que nos pida un número de ventas a introducir,
// después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
// Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce cuantas ventas vas a registrar");
        int numVentas = scanner.nextInt();
        int Ventas;
        double resultado = 0;

        for (int i = 1; i <= numVentas; i++) {
            System.out.println("Introduce el valor de la venta " + i + " : ");
            Ventas = scanner.nextInt();
            resultado = resultado + Ventas;
        }
        System.out.println("resultado = " + resultado);
    }
}
