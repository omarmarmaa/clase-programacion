package Unidad3.ejercicio1;

import java.util.Scanner;

//Define un método que retorne el valor absoluto de un número entero.
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        System.out.println(valorabsoluto(numero));
        scanner.close();
    }

     static int valorabsoluto(int numero) {

        if (numero >= 0) {
            return numero;
        } else {
            System.out.println("no se considera valor absoluto");
            return 0;
        }
    }
}
