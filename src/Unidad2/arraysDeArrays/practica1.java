package Unidad2.arraysDeArrays;

import java.util.Arrays;

public class practica1 {
    public static void main(String[] args) {
        int[] numeros1 = {1, 2, 3};
        int[] numeros2 = {4, 5, 6};

        // hay que crear el array que componga los dos
        // dentro metemos las dos variables
        int[][] calificaciones = {numeros1, numeros2};

        // hacemos el bucle for each donde
        for (int[] calificacion : calificaciones) {
            System.out.println(Arrays.toString(calificacion));
        }
    }
}
