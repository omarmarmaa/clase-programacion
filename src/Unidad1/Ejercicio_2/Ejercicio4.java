package Unidad1.Ejercicio_2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("inserte su numero por favor ");
        int numero = scanner.nextInt();
        numero= numero*2;
        System.out.println("tu numero duplicado es "+ numero );
        numero= numero*3;
        System.out.println("tu numero triplicado es "+ numero);
    }
}
