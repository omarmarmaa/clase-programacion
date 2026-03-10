package Unidad5.Ejercicios4Set;

import java.util.HashSet;
import java.util.Scanner;

/*
¿Estás en la lista? (Uso de contains)

Practicar la búsqueda rápida de elementos, una de las mayores ventajas de los conjuntos.

Tarea: Crea un HashSet<Integer> con una lista de 5 números de identificación (IDs) fijos.

Acción: Pide al usuario por teclado un número usando Scanner.

Salida: Indica mediante un boolean si ese ID tiene acceso (si está contenido en el Set) o no.
 */
public class Ejercicio2 {
     static HashSet<Integer> IDs=new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        IDs.add(12345);
        IDs.add(23456);
        IDs.add(34567);
        IDs.add(45678);
        IDs.add(56788);

        System.out.println("Escribe un codigo de 5 digitos");
        int codigoNuevo= scanner.nextInt();
        boolean verificacion= IDs.contains(codigoNuevo);
        if (verificacion){
            System.out.println(codigoNuevo);
        }else{
            System.out.println("no tiene acceso");
        }

        scanner.close();
    }
}
