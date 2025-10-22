package Unidad2.ejercicio2;

import java.util.Scanner;

// Crea un programa que te pida la altura de un triángulo rectángulo y lo muestre con asteriscos. Ejemplo con 4:
//*
//**
//***
//****
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Instroduce la altura de un triangulo");
        int altura = scanner.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        scanner.close();
    }
}
