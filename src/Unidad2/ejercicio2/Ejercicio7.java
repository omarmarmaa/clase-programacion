package Unidad2.ejercicio2;

import java.util.Scanner;

//Pide por teclado dos números y genera 10 números aleatorios entre esos números.
// Usa el método Math.random para generar un número entero aleatorio (recuerda el casting de double a int).
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int min = Math.max(n1, n2);
        int max = Math.min(n1, n2);
        for (int i = 1; i <= 2; i++) {
            int aleatorio = (int) (Math.random() * (max - min + 1)) + min;
            System.out.println(aleatorio);
        }
    }
}
