package Unidad3.ejercicio1;

import java.util.Scanner;

//Define un método sumar que reciba dos enteros y retorne su suma.
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int numero1= scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2= scanner.nextInt();
        int resultado=suma(numero1,numero2);

        System.out.println("el resultado es " + resultado);
        scanner.close();
    }
    static int suma(int numero1, int numero2){
        return numero1+numero2;
    }
}
