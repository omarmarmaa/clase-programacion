package Unidad2.ejercicio1;

import java.util.Scanner;

//Desarrolla un programa que lea números hasta que se introduzca un número negativo
// y después indique si se ha dado el mismo número dos veces consecutivas:
//Introduciendo: 1 3 5 3 4 6 7 –1
//Da como salida: No
//Introduciendo: 1 3 5 6 6 4 3 –1
//Da como salida : Si
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anterior = scanner.nextInt();
        int actual;
        boolean repetido = false;

        if (anterior < 0) {
            System.out.println("No hubo repeticion");
            scanner.close();
            return;
        }
        while (true) {
            System.out.println("Ingrese el numero por favor ");
            actual = scanner.nextInt();
            if (actual < 0) {
                System.out.println("No");
                break;
            }
            if (anterior == actual) {
                repetido = true;
                System.out.println("¿hay repeticion? " + repetido);

                break;
            }
        }

        scanner.close();
    }
}
