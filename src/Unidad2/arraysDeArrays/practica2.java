package Unidad2.arraysDeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class practica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //creamos el array para que se componga de las dos variables creadas
        int[][] numeraciones = new int[2][3];

        // creamos el for each para que vaya pidiento los numeros teneiendo como limite el numero de filas establecido anteriormente
        for (int i = 0; i < numeraciones.length; i++) {
            for (int j = 0; j < numeraciones[i].length; j++) {
                System.out.println("introduce la numeracion " + " [ " + i + " ] " + " [ " + j + " ]");
                numeraciones[i][j] = scanner.nextInt();
            }
        }
        //el tercer bucle es para que no nos de las direcciones de memoria y asi los datos sean legibles.
        for (int[] numeros : numeraciones) {
            System.out.println(Arrays.toString(numeros));

        }
        scanner.close();
    }
}
