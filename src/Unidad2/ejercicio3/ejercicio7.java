package Unidad2.ejercicio3;

import java.util.Scanner;

//Escribe un método que convierta grados Celsius a Fahrenheit.
//F=(°C×5/9)+32
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor en celcius por favor:");
        int celcius = scanner.nextInt();

        System.out.println(farenheit(celcius));
        scanner.close();
    }

    public static int farenheit(int a) {
        return (a * 9 / 5) + 32;
    }
}
