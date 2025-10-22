package Unidad1.Ejercicio_2;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("introduce tu numero de tres cifras: ");
        int numero= scanner.nextInt();
        System.out.println((numero/100) + " " + (numero / 10 % 10) + " " + (numero % 10));
    }
}
