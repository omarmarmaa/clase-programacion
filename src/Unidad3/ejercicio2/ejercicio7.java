package Unidad3.ejercicio2;

import java.util.Scanner;

//Método repite(), que recibe como parámetro una cadena de caracteres y un número,
// y retorna un nuevo String donde aparece repetida la cadena de caracteres tantas veces como indique el numero pasado como parámetro.
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        String cadena = scanner.next();
        int acumulador1 = scanner.nextInt();
        repite(numero, cadena, acumulador1);
        scanner.close();
    }

    public static String repite(int numero, String cadena, int acumulador1) {
        int a = 1;
        if (acumulador1 <= numero) {
            return cadena;
        } else {
            acumulador1 = acumulador1 + a;
        }
    }

}
