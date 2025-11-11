package Unidad2.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
crea un array de 20 elementos donde hay almacenados numeros enteros aleatoriamente.
random r= new random();
r.nextInt(10);

haz un programa que pida un número y diga cuántas veces aparece el número dentro
del array.
 */
public class practica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        System.out.println("que numero desea buscar");
        int numeroBuscado = scanner.nextInt();

        int[] elementos = new int[20];
        int contador = 0;


        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = r.nextInt(10);
            if (elementos[i] == numeroBuscado) {
                contador++;
            }
        }
        System.out.println("Arrays " + Arrays.toString(elementos));
        System.out.println("el numero buscado es " + numeroBuscado + " y aparecio " + contador +
                " veces");
        scanner.close();
    }
}
