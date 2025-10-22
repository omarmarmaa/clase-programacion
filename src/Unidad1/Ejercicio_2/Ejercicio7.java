package Unidad1.Ejercicio_2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿cuales son los KM/H que deseas convertir?");
        int velocidad1= scanner.nextInt();
        System.out.println("la conversión en m/s es = " + velocidad1 / 3.6);

    }
}
