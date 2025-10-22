package Unidad2.ejercicio2;

//Muestra los números primos entre 1 y 100.
public class Ejercicio8 {
    public static void main(String[] args) {


        for (int i = 2; i <= 100; i++) {
            int contador = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j  == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                System.out.println(i);
            }



        }
    }
}