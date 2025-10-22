package Unidad3;

import java.util.Scanner;

//Escribe un metodo para calcular el area de un rectangulo dados la base y altura
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa la base");
        int base = scanner.nextInt();
        System.out.println("ingresa la altura");
        int altura = scanner.nextInt();
        scanner.close();
        calculararea(base, altura);
        System.out.println("el area es " + calculararea(base, altura));

    }

    static int calculararea(int base, int altura) {
        return base * altura;


    }
}
