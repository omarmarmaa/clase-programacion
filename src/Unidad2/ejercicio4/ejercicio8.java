package Unidad2.ejercicio4;

import java.util.Scanner;

//Haz dos métodos, una para cifrar() y otro para descifrar() una cadena de caracteres.
// Estos métodos reciben un String y retornan ese String ya cifrado o descifrado.
// Para hacer el cifrado de un String, se cambia cada letra por la que está dos puestos mas adelante
// ( la a se cambia por la c),
// teniendo en cuenta que el cambio es circular, es decir, la z se cambiará por la b.
// El proceso de descifrado es el contrario.
// Los caracteres que no sean alfabéticos no registrarán ningún cambio.
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();
        scanner.close();

        String cifrada = cifrar(cadena);
        String descifrada = descifrar(cifrada);

        System.out.println("Cifrada: " + cifrada);
        System.out.println("Descifrada: " + descifrada);
    }
    public static String cifrar(String cadena) {
        String resultado = "";

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (c >= 'a' && c <= 'z') {
                c = (char)(c + 2);
                if (c > 'z') {
                    c -= 26;
                }
            } else if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 2);
                if (c > 'Z') {
                    c -= 26;
                }
            }

            resultado += c;
        }
        return resultado;
    }

    public static String descifrar(String cadena) {
        String resultado = "";

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (c >= 'a' && c <= 'z') {
                c = (char)(c - 2);
                if (c < 'a') {
                    c += 26;
                }
            } else if (c >= 'A' && c <= 'Z') {
                c = (char)(c - 2);
                if (c < 'Z') {
                    c += 26;
                }
            }

            resultado += c;
        }
        return resultado;
    }

}

