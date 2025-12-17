package Unidad2.ejercicio5;

//Implementa un programa que codifique una cadena cambiando cada letra por la siguiente en el código ASCII.
//Introduciendo: “Lunes”
//Da como salida: “Mvoft”
public class ejercicio3 {
    public static void main(String[] args) {
        String palabra="Lunes";

        for (int i=0; i<palabra.length(); i++){
            char caracter=palabra.charAt(i);
            int conversionAnumero=caracter+1;
            char codificacion=(char) conversionAnumero;
            System.out.println(" palabra modificada " + codificacion);

        }
    }
}
