package Unidad2.arrays.ejercicios;

import java.util.Arrays;
import java.util.Random;

//Dado un array de números enteros, realiza un programa que indique si está ordenado o no. (hecho en clase)
public class ejercicio2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numerosEnteros = new int[3];


        for (int i = 0; i < numerosEnteros.length; i++) {
            numerosEnteros[i] = random.nextInt(10);
        }
        boolean resultado = ordenado(numerosEnteros);
        System.out.println(" arrays " + Arrays.toString(numerosEnteros));
        System.out.println("esta serie de numeros esta ordenada? " + resultado);
    }

    public static boolean ordenado(int numerosEnteros[]) {
        for (int i = 0; i < numerosEnteros.length - 1; i++) {
            if (numerosEnteros[i] > numerosEnteros[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
