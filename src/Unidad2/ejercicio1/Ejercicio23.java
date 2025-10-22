package Unidad2.ejercicio1;

import java.util.Scanner;

//Desarrolla un programa que lea números hasta que se den cinco ceros y escriba después la suma de los números leídos.
//Introduciendo: 1 3 5 0 4 0 6 7 –1 0 0 8 0
//Da como salida: 33
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contadorCeros = 0;

        while (contadorCeros < 5) {
            System.out.println("Ingrese el numero por favor:");
            numero = scanner.nextInt();
            suma += numero;
            if (numero == 0) {
                contadorCeros++;
            }
        }
        System.out.println("La suma es: " + suma);
    }
}
