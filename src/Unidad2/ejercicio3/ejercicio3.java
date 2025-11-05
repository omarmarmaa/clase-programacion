package Unidad2.ejercicio3;

import java.util.Scanner;

//Implementa un método que reciba un nombre y edad y muestre un mensaje personalizado.
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del usuario");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el edad del usuario");
        int edad = scanner.nextInt();

        mensajePersonalizado(nombre, edad);
        scanner.close();
    }

    static void mensajePersonalizado(String a, int b) {
        System.out.println("hola amigo " + a + " " + b);
    }
}
