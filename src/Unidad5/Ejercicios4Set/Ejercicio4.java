package Unidad5.Ejercicios4Set;

import java.util.ArrayList;
import java.util.HashSet;

/*
Ejercicio 4: Limpieza de una Lista (Conversión)

Aprender a "limpiar" duplicados de una lista de forma eficiente.

Tarea: Crea un ArrayList<String> con los colores: "Rojo", "Azul", "Rojo", "Verde", "Azul".

Acción: Pasa todos los elementos del ArrayList a un HashSet (puedes usar el constructor del Set o un bucle).

Salida: Muestra la nueva colección sin colores repetidos.
 */
public class Ejercicio4 {
    static ArrayList<String> colores= new ArrayList<>();

    public static void main(String[] args) {
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        HashSet<String> contenedor = new HashSet<>(colores);
        System.out.println(contenedor);
    }
}
