package Unidad2.ejercicio1;

import java.util.Scanner;

//Programa Java que lea un número entero y calcule si es par o impar.//
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de la operacion: ");
        int numeroentero = scanner.nextInt();

        if (numeroentero==0){
            System.out.println("Es cero");
        } else if (numeroentero < 0) {
            System.out.println("Es negativo");
        }
        if (numeroentero % 2 == 0) {
            System.out.println("es par");
        } else  {
            System.out.println("es impar");
        }
        scanner.close();
    }
}
