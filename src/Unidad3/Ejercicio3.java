package Unidad3;

import java.util.Scanner;

// implementa un método que reciba un nombre y edad y muestre un mensaje personalizado.
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("Dime tu edad");
        int edad = scanner.nextInt();

        scanner.close();
        mensajeAlUsuario(nombre, edad);
    }

    static void mensajeAlUsuario(String nombre, int edad) {
        System.out.println("hola " + nombre + " tienes " + edad + " :)");

    }

}
