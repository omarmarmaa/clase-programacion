package Unidad2.ejercicio1;

import java.util.Scanner;

//Escribir un programa en Java que lea un número entero desde teclado
// y realiza la suma de los 100 número siguientes, mostrando el resultado en pantalla.
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero por favor ");
        long numero = scanner.nextInt();
        long suma = numero;

        for (int i = 1; i <= 100; i++) {
            numero = suma;
            suma += numero + i;
            System.out.println(i + " = " + suma);
        }
        scanner.close();
    }
}
