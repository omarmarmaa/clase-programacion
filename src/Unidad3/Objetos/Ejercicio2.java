package Unidad3.Objetos;

public class Ejercicio2 {
    public static void main(String[] args) {
        String contenedor= "java es facil";
        StringBuilder nueva= new StringBuilder(contenedor);


        System.out.println(contenedor.toUpperCase());
        System.out.println(contenedor.replace("facil", "poderoso"));
        System.out.println(contenedor.substring(0,4));
        System.out.println(nueva.reverse());


    }
}
