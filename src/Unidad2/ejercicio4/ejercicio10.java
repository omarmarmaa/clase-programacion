
package Unidad2.ejercicio4;

import java.util.Scanner;

//Haz programa que ordene alfabéticamente las letras de una frase.
// El programa debe pedir por teclado una frase y escribirla con las letras ordenadas.
//Ejemplo: Tecleando la palabra “hola”
//Escribirá “ahlo”
//El trabajo de ordenar la frase lo realizará un método llamado ordenar()
// al que se le pasará la frase y la retornará ordenada. Este método realizará el trabajo de la siguiente
// manera:
//Repetir tantas veces como letras tenga la frase
//{
//Obtener la letra menor
//Añadir esa letra al resultado
//Eliminar la letra de la frase original
//}
//El proceso de obtener la letra menor lo realizará un método llamado
//obtenerLetraMenor() al que se le pasa la frase y nos da la letra mas pequeña.
//Asimismo el trabajo de eliminar la letra de la frase original lo realizará otro
//método llamado eliminarLetra() al que se le pasa la frase y la letra a eliminar y nos da como resultado la frase modificada.
public class ejercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe una palabra o frase: ");
        String frase = sc.nextLine();
        sc.close();

        String resultado = ordenar(frase);

        System.out.println("Frase ordenada: " + resultado);
    }
    public static String ordenar(String frase) {

        String resultado = "";
        while (frase.length() > 0) {
            char menor = obtenerLetraMenor(frase);
            resultado = resultado + menor;
            frase = eliminarLetra(frase, menor);
        }

        return resultado;
    }
    public static char obtenerLetraMenor(String frase) {

        char menor = frase.charAt(0);

        for (int i = 1; i < frase.length(); i++) {
            char letraActual = frase.charAt(i);

            if (letraActual < menor) {
                menor = letraActual;
            }
        }
        return menor;
    }
    public static String eliminarLetra(String frase, char letra) {

        int posicion = -1;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                posicion = i;
            }
        }
        String nuevaFrase = "";

        for (int i = 0; i < frase.length(); i++) {
            if (i != posicion) {
                nuevaFrase = nuevaFrase + frase.charAt(i);
            }
        }

        return nuevaFrase;
    }
 }
