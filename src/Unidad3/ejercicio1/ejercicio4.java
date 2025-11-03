package Unidad3.ejercicio1;

import java.util.Scanner;

//Escribe un método para calcular el área de un rectángulo dados base y altura.
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese la base");
        int base= scanner.nextInt();
        System.out.println("Ingrese la altura");
        int altura = scanner.nextInt();
        int resultado=rectangulo(base,altura);

        System.out.println("el resultado es " + resultado);
        scanner.close();
    }
    static int rectangulo(int base,int altura){
        return base * altura;
    }
}
