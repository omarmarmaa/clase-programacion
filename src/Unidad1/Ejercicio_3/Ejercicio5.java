package Unidad1.Ejercicio_3;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el primer caracter ");
        char a = scanner.next().charAt(0);
        System.out.println("Escribe el segundo caracter ");
        char b = scanner.next().charAt(0);
        System.out.println("tus caracteres son: " + a + "y" + b);
        System.out.println(a == b ? "Son iguales" : "No son iguales");
        scanner.close();
    }
}
