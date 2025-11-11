package Unidad2.arrays;

import java.util.Arrays;
import java.util.Random;

public class practica3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] numero = new int[3];


        for (int i = 0; i < numero.length; i++) {
            numero[i] = r.nextInt(3);
        }

        System.out.println("Array " + Arrays.toString(numero));
        System.out.println("esta ordenado ? " + ordenado(numero));

    }

    public static boolean ordenado(int[] numero) {
        for (int i = 0; i < numero.length - 1; i++) {
            if (numero[i] > numero[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
