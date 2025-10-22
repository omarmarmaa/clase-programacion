package Unidad2.ejercicio1;

//Calcular el mayor de tres números enteros en Java.//
public class Ejercicio2 {
    public static void main(String[] args) {
        int a = -500;
        int b = -500;
        int c = -2;

        if (a >=b && a >= c) {
            System.out.println(a);
        } else if (b >= c && b >= a) {
            System.out.println(b);
        } else if (c >= a && c >= b) {
            System.out.println(c);
        }
    }
}
