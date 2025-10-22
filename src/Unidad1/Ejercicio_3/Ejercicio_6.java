package  Unidad1.Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        double numero = scanner.nextDouble();
        System.out.println("ingrese otro numero");
        double numero2 = scanner.nextDouble();
        System.out.println("resultado: " + (numero / numero2));
        System.out.println((numero2 != 0) ? "se puede dividir entre 0" : "no se puede dividir entre 0");
    }
}
