package Unidad2.ejercicio1;

import java.util.Scanner;

//Lee un número por teclado y comprueba que este número es mayor o igual que cero,
// si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.println("introduce el numero debe ser mayor o igual a 0");
            numero = scanner.nextInt();
        } while (numero < 0);
        System.out.println("Es valido " + numero);


    }
}
