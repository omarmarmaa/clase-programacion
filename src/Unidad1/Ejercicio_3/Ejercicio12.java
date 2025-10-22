package Unidad1.Ejercicio_3;

import java.util.Scanner;

public class Ejercicio12 {
    //Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. El IVA será una constante del 21%.//
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("introduce el precio de un producto:");
        double precio= scanner.nextInt();
        double resultado1=0;
        resultado1=precio*1.21;
        System.out.println("El resultado de tu precio con el 21% de IVA es "+ resultado1);


    }
}
