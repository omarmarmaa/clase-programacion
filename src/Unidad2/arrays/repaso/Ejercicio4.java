package Unidad2.arrays.repaso;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Ejercicio1
        int[] a= {3,3,3};
        int[] b=a;


        //comparar
        int[] c= {1,2,3};
        int[] d= {1,2,3};
        System.out.println(" == " + (c==d));
        System.out.println("equals " + c.equals(d));
        //comparar el contenido
        System.out.println(Arrays.equals(c,d));
    }
}
