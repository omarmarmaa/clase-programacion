package Unidad2.ejercicio1;

//Crea un programa que muestre los números pares hasta el 100
public class Ejercicio13 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
