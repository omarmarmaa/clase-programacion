package Unidad2.ejercicio5;

/*
Crea un programa que pase un String a mayúsculas y diga cuántas letras han cambiado.
Introduciendo: “Hola a Todos”
Da como salida: “HOLA A TODOS” 8 cambios
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        String contenedor= "Hola a Todos";
        int contador=0;
        for (int i=0; i<contenedor.length(); i++) {
            if (contenedor.charAt(i) >='a' && contenedor.charAt(i) <= 'z') {
                contador++;
            }
        }
        System.out.println(contenedor.toUpperCase());
        System.out.println(" ha habido este numero de cambios " + contador);
    }
}
