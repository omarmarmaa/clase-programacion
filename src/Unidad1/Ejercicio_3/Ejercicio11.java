package Unidad1.Ejercicio_3;

import java.util.Scanner;
/*Crea un programa que pida cuál es el radio de una circunferencia y nos calcule cuál es la longitud y el área. */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el radio para calcular la circunferencia");
        double  numero =scanner.nextDouble();
        double resultado=0;
        resultado =2*Math.PI*numero;
        System.out.println("el resultado de la circunferencia es: " +  resultado );
        resultado=Math.PI*numero*numero;
        System.out.println("el area es " + resultado);

    }
}
