package Unidad2.ejercicio4;

import java.util.Scanner;

//Método repite(), que recibe como parámetro una cadena de caracteres y un número,
// y retorna un nuevo String donde aparece repetida la cadena de caracteres tantas veces como indique el numero pasado como parámetro.
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca el numero de veces que quiere que se repita ");
        int numero = scanner.nextInt();
        System.out.println("introduzca la palabra");
        String cadena = scanner.next();

        System.out.println(repite(numero,cadena));
        scanner.close();
    }
    public static String repite(int numero, String cadena) {
        String resultado=" ";
        for (int i = 0; i < numero; i++) {
            resultado=resultado + cadena +" ";

        }
        return resultado;
    }
}
