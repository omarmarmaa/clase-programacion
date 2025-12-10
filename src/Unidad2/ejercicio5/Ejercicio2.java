package Unidad2.ejercicio5;
/*
Desarrolla un programa que reciba una cadena y diga cuántas palabras contiene. (Las palabras pueden estar separadas por espacios, puntos o comas).
Introduciendo: “Hola a todos. Adios”
Da como salida: 4
 */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String cadena=scanner.nextLine();
        String[] nueva=cadena.split("\\s+");

        System.out.println(nueva.length);

        scanner.close();
    }
}
