package Unidad3.ejercicio1;

import java.util.Scanner;

//Crea un método para determinar si un número es par o impar.
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor del numero: ");
        int numero=scanner.nextInt();

        determinante(numero);
        scanner.close();
    }
    public static void determinante(int a){
        if (a%2==0){
            System.out.println("es par");
        }else {
            System.out.println("es impar");
        }
    }
}
