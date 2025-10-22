package Unidad2.ejercicio1;

import java.util.Scanner;

//Realiza un programa que permita la entrada de varios números y calcule su media.
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros que introducira");
        long cantidad = scanner.nextInt();
        double media = 0;
        double numero;

        double suma = 0;
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Ingrese el numero " + i + " Por favor");
            numero = scanner.nextDouble();
            suma += numero;

        }
        media = suma / cantidad;
        System.out.println("la media es: " + media);


        scanner.close();
    }
}
