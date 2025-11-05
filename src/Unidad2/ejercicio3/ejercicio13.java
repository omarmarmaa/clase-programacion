package Unidad2.ejercicio3;

import java.util.Scanner;

//Sobrecarga un método saludar que pueda recibir: sin parámetros, un nombre, un nombre y unos apellidos.
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        nombre(nombre);
        apellido(nombre, apellido);
    }

    public static void nombre(String nombre) {
        System.out.println("holaaa " + nombre);
    }

    public static void apellido(String nombre, String apellido) {
        System.out.println("holaaaaaaa " + nombre + " " + apellido);
    }
}
