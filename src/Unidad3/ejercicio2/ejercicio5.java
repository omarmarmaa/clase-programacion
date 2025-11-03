package Unidad3.ejercicio2;

import java.util.Scanner;

//Método factorial(), que calculará el factorial del número que se le pasa como parámetro.
// Retornará el resultado del cálculo del factorial,
// o bien un -1 en caso de que el parámetro pasado sea negativo, y un -2 en caso de que el parámetro pasado sea cero.
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero=scanner.nextInt();

        System.out.println(factorial(numero));
        scanner.close();
    }
    public static int factorial(int numero){
        if (numero==1){
            return 1;
        }else  {
           return numero*factorial(numero-1);
        }
    }

}
