package Unidad1.Ejercicio_3;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Teclea la cantidad de euros: ");
                int cantidad = scanner.nextInt();

                System.out.println("\nLa cantidad de billetes que te tengo que dar es:");

                int billetes500 = cantidad / 500;
                cantidad %= 500;
                System.out.println(billetes500 + " billetes de 500€");

                int billetes200 = cantidad / 200;
                cantidad %= 200;
                System.out.println(billetes200 + " billetes de 200€");

                int billetes100 = cantidad / 100;
                cantidad %= 100;
                System.out.println(billetes100 + " billetes de 100€");

                int billetes50 = cantidad / 50;
                cantidad %= 50;
                System.out.println(billetes50 + " billetes de 50€");

                int billetes20 = cantidad / 20;
                cantidad %= 20;
                System.out.println(billetes20 + " billetes de 20€");

                int billetes10 = cantidad / 10;
                cantidad %= 10;
                System.out.println(billetes10 + " billetes de 10€");

                int billetes5 = cantidad / 5;
                cantidad %= 5;
                System.out.println(billetes5 + " billetes de 5€");



            }
}
