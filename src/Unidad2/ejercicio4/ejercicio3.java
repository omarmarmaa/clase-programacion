package Unidad2.ejercicio4;

import java.util.Scanner;

//Haz un método llamado esVocal(),
// al que se le pasa como parámetro un carácter y retorna un valor true en caso de que el carácter sea una vocal,
// y un valor false en caso contrario.
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("verificaremos si es una vocal o no");
        char letra = scanner.next().charAt(0);

        System.out.println(esvocal(letra));
        scanner.close();
    }

    public static boolean esvocal(char letra) {
        if (letra == 'a') {
            return true;
        } else if (letra == 'e') {
            return true;
        } else if (letra == 'i') {
            return true;
        } else if (letra == 'o') {
            return true;
        } else if (letra == 'u') {
            return true;
        }
        return false;
    }
}
