package Unidad5.EjercicioList;

import java.util.ArrayList;
import java.util.List;

/*
Ejercicio 3: Listas y Tipos Primitivos (Wrapper)
Crea una lista de números enteros (Integer).
Rellena la lista con 10 números aleatorios entre 1 y 50.
Calcula la suma de todos los números de la lista recorriéndola con un bucle for clásico.
Muestra el número mayor encontrado en la lista.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        List numeros=new ArrayList<>();

        int random1;

        for (int i=0; i<10; i++){
            random1 = (int) (Math.random() * 50) + 1;
             numeros.add(random1);
        }
        System.out.println(numeros);

    }
}
