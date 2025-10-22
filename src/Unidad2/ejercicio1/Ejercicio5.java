package Unidad2.ejercicio1;

import java.util.Scanner;

//Crea un programa que pide tu edad y compruebe si puedes votar.//
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce tu edad");
        int edad = scanner.nextInt();
        if (edad >= 18) {
            System.out.println("puedes votar");
        } else {
            System.out.println("No puedes votar");
        }
        scanner.close();

    }
}
