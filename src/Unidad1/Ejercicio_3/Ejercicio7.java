package Unidad1.Ejercicio_3;
/*Programa que lea un carácter por teclado y compruebe si es una letra mayúscula*/
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("ingrese su caracter");
        char caracter=scanner.nextLine().charAt(0);
        System.out.println((caracter >='A'  &&  caracter<='Z') ? "Esta en mayusculas" : "Esta en minusculas");


    }
}
