package Unidad2.ejercicio1;

//Escribir un programa en Java que multiplique los 20 primeros números naturales (1*2*3*4*5…).
public class Ejercicio18 {
    public static void main(String[] args) {

        long numero = 1;
        for (int i = 1; i <= 20; i++) {
            numero *= i;
            System.out.println(i + " = " + numero);

        }
    }
}
