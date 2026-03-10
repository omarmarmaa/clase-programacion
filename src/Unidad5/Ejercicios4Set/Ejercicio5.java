package Unidad5.Ejercicios4Set;

import com.sun.source.tree.UsesTree;

import java.util.HashSet;
import java.util.Set;

/*
Ejercicio 5: Detector de Errores (Validación de add)

El método add() devuelve un valor booleano que indica si el elemento se añadió con éxito o no.

Tarea: Crea un Set<String> para matrículas de coches.

Acción: Intenta añadir dos veces la misma matrícula.
Lógica: Si el método add() devuelve false, muestra un mensaje por pantalla: "ERROR: La matrícula ya existe en el sistema"
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Set<String> matriculas=new HashSet<>();
        matriculas.add("y1234");
        matriculas.add("y2345");
        matriculas.add("y1234");
        matriculas.add("g56789");
        matriculas.add("j1234");
        System.out.println(matriculas);
        System.out.println("Añade de nuevo la matriula 1234 kjf");

        boolean introducido=matriculas.add("1234 kjf");
        if (!introducido){
            System.out.println("ERROR: La matricula ya existe en el sistema");
        }
    }
}
