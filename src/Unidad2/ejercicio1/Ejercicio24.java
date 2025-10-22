package Unidad2.ejercicio1;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entre 0 y 9999: ");
        int num = scanner.nextInt();

        if (num < 0 || num > 9999) {
            System.out.println("Número fuera de rango");
        } else {
            String s = Integer.toString(num);
            boolean esCapicua = true;

            // Comparar caracteres opuestos
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    esCapicua = false;
                    break;
                }
            }

            if (esCapicua) {
                System.out.println("El número es capicúa");
            } else {
                System.out.println("El número NO es capicúa");
            }
        }

        scanner.close();
    }
}

