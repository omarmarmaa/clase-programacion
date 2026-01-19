package Unidad2.Arrays;

import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] arr = new int[50];
        Random r = new Random();


        for (int i = 0; i < 50; i++) {
            arr[i] = r.nextInt(100) + 1;
        }


        System.out.print("Array: ");
        for (int i = 0; i < 50; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Faltan: ");
        for (int num = 1; num <= 100; num++) {
                boolean encontrado = false;


            for (int i = 0; i < 50; i++) {
                    if (arr[i] == num) {
                        encontrado = true;
                    }
                }

                if (!encontrado) {
                    System.out.print(num + " ");
                }
            }
        }
    }
