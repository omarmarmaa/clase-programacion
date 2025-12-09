package Unidad3.Objetos;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Introduzca su palbra");
        String palabra= scanner.next();

        System.out.println(" su palabra tiene una longitud de " + palabra.length());
        System.out.println(" primer caracter " + palabra.charAt(0));
        System.out.println((" ultimo caracter " + palabra.charAt(palabra.length()-1)));
        System.out.println(" contiene la 'a' "+ palabra.contains("a"));
        scanner.close();
    }
}
