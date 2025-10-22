package Unidad2.ejercicio1;

//Escribir un programa en Java que imprima por pantalla
// los números pares entre el 5 y el 15.000.
public class Ejercicio8 {
    public static void main(String[] args) {

        int i = 0;
        for (i = 5; i <= 15000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
