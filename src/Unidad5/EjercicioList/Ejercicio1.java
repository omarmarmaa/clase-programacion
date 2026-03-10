package Unidad5.EjercicioList;
/*
Ejercicio 1: Operaciones Básicas con Alumnos
Crea un programa que gestione una lista de nombres de alumnos (String) utilizando un ArrayList.
Añade cinco nombres a la lista.
Inserta un nombre nuevo en la tercera posición (índice 2).
Muestra el tamaño actual de la lista utilizando el atributo o método correspondiente.
Elimina al alumno que esté en la última posición.
 */
import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String>Nombre=new ArrayList<>();
        Nombre.add("juan");
        Nombre.add("lucas");
        Nombre.add("Lopez");
        Nombre.add("Carlos");
        Nombre.add("José");
        Nombre.add(2,"Diana");

        int total= Nombre.size();

        for (String nombre: Nombre){
            System.out.println(nombre);

        }
        System.out.println(" Tamaño total "+ total);

        Nombre.remove(5);

        for (String nombre: Nombre){
            System.out.println(nombre);

        }
        System.out.println(" Tamaño total "+ total);
    }
}
