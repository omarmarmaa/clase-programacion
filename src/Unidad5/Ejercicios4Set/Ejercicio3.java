package Unidad5.Ejercicios4Set;

import java.util.TreeSet;

/*
Ejercicio 3: Ordenación de Premios (TreeSet)

Entender la diferencia entre un saco desordenado (HashSet) y uno que ordena automáticamente (TreeSet).

Tarea: Crea un TreeSet<Integer> para guardar los números premiados de una rifa.

Acción: Añade los números: 45, 12, 89, 3, 22.

Salida: Recorre el conjunto con un bucle for-each y observa cómo Java los muestra ordenados de menor a mayor sin haber hecho nada extra.
 */
public class Ejercicio3 {
    static TreeSet<Integer> numerosPremiados=new TreeSet<>();

    public static void main(String[] args) {
        numerosPremiados.add(45);
        numerosPremiados.add(12);
        numerosPremiados.add(89);
        numerosPremiados.add(3);
        numerosPremiados.add(22);

        for (int numero:numerosPremiados){
            System.out.println(numero);
        }
    }
}
