package Unidad2.arrays.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

//Crea una agenda para almacenar nombres y direcciones de N personas.
// Después haz un programa que permita ir consultando el nombre y la dirección de las personas almacenadas. (hecho en clase)
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] nombre = new String[n];
        String[] Direcciones = new String[n];


        for (int i = 0; i < n; i++) {
            System.out.print("introduce el nombre numero " + i);
            nombre[i] = scanner.next();
            System.out.print("introduce la direccion numero " + i);
            Direcciones[i] = scanner.next();
        }
        System.out.println("nombres " + Arrays.toString(nombre));
        System.out.println("direcciones " + Arrays.toString(Direcciones));
        scanner.close();
    }
}
