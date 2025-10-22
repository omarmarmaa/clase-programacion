package Unidad2.ejercicio2;

import java.util.Scanner;

//Realizar un programa que calcule la potencia de un número baseexponente.
// La potencia se hará por medio de multiplicaciones,
// está prohibido usar Math.pow()
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el exponente: ");
        int cantidad = scanner.nextInt();
        System.out.println("Introduce el numero: ");
        int numero = scanner.nextInt();
        int resultado = 1;
        for (int i = 1; i <= cantidad; i++) {
            resultado = resultado * numero;
        }
        System.out.println("resultado: " + resultado);


    }
}
