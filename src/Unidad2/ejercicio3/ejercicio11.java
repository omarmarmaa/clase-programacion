package Unidad2.ejercicio3;

import java.util.Scanner;

//Implementa dos métodos llamados multiplicar:
//Uno que reciba dos enteros y devuelva la multiplicación.
//Otro que reciba tres enteros y devuelva la multiplicación.
//Llama a ambos desde el main y muestra los resultados
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantos numeros que desea multiplicar? ");
        int valor;
        valor = scanner.nextInt();
        int resultado = 0;

        switch (valor) {
            case 2:
                int a, b;
                System.out.println("ingese el primer numero");
                a = scanner.nextInt();
                System.out.println("ingese el segundo numero");
                b = scanner.nextInt();
                resultado = multiplicacion(a, b);
                break;
            case 3:
                int c;
                System.out.println("ingese el primer numero");
                a = scanner.nextInt();
                System.out.println("ingese el segundo numero");
                b = scanner.nextInt();
                System.out.println("ingrese el tercer numero");
                c = scanner.nextInt();
                resultado = multiplicacion(a, b, c);
                break;

            default:
                System.out.println("No es un numero valido");
        }
        System.out.println("El resultado es: " + resultado);
        scanner.close();

    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static int multiplicacion(int a, int b, int c) {
        return a * b * c;
    }
}
