package Unidad2.ejercicio3;

import java.util.Scanner;

//Crea un método llamado operacion que reciba dos números
// y un código de operación (1 para suma, 2 para resta, 3 para multiplicación, 4 para división).
// Según el código, el método debe realizar la operación indicada y mostrar el resultado.
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int a = scanner.nextInt();
        System.out.println("ingrese el segundo numero");
        int b = scanner.nextInt();
        System.out.println("ingrese el la operacion que desea realizar 1 para suma 2 para resta 3 para multiplicacion y 4 para division");
        int codigoOperacion = scanner.nextInt();

        System.out.println("el resultado es " + operacion(a, b, codigoOperacion));
        scanner.close();
    }

    public static int operacion(int a, int b, int codigoOperacion) {
        switch (codigoOperacion) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                return a / b;
        }
        return 0;
    }
}
