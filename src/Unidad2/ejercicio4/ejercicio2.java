package Unidad2.ejercicio4;

import java.util.Scanner;

//Escribe un método recursivo para calcular la serie de Fibonacci hasta n.
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(fibonacci(i) + "");
            scanner.close();
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }
}
