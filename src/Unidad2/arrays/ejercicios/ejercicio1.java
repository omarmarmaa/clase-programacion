package Unidad2.arrays.ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Crea un array de 20 elementos donde hay almacenados números enteros aleatorios (hasta 10).
// Haz un programa que pida un número y diga cuántas veces aparece el número dentro del array. (hecho en clase)
public class ejercicio1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca el numero que desear buscar");
        int numeroBuscado = scanner.nextInt();
        int[] elementos = new int[20];
        int contador = 0;

        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = random.nextInt(10);
            if (elementos[i] == numeroBuscado) {
                contador++;
            }
        }
        System.out.println(" arrays " + Arrays.toString(elementos));
        System.out.println(" el numero buscado es " + numeroBuscado + " ha salido " + contador + " veces ");
        scanner.close();
    }
}
