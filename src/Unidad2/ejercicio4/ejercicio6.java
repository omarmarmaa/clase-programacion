package Unidad2.ejercicio4;

import java.util.Scanner;

//Escribe el método inverso(),
// que recibe un numero y retorna el inverso (si recibe el 1234 da como retorno el 4321).
// Prohibido usar método reverse().
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero ");
        int numero = scanner.nextInt();

        System.out.println("Número inverso  " + inverso(numero, 0));
    }

    public static int inverso(int numero, int acumulado) {
        if (numero == 0) {
            return acumulado;
        } else {
            int ultimo = numero % 10;
            return inverso(numero / 10, acumulado * 10 + ultimo);
        }
    }
}