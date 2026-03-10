package Unidad5.EjercicioList;

import java.util.ArrayList;
import java.util.Scanner;

/*
Ejercicio 2: Búsqueda y Modificación
Utilizando la lista del ejercicio anterior:
Pide un nombre por teclado y comprueba si el alumno existe en la lista.
Si existe, modifica su nombre para que aparezca todo en mayúsculas.
Muestra la lista completa utilizando un bucle for-each.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> Nombre=new ArrayList<>();
        Nombre.add("juan");
        Nombre.add("lucas");
        Nombre.add("Lopez");
        Nombre.add("Carlos");
        Nombre.add("José");
        Nombre.add(2,"Diana");

        String nombre=scanner.next();
        boolean comprobacion = Nombre.contains(nombre);

        for (String nombre1 : Nombre){
            System.out.println(nombre1);

        }
        if (comprobacion){
            System.out.println(" existe "+ comprobacion + " " + nombre.toUpperCase());
        }else {
            System.out.println("existe " + comprobacion);
        }
        scanner.close();
    }
}
