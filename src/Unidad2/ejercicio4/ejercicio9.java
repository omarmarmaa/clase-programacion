



    //Realiza varios métodos para convertir un numero decimal en binario, octal o hexadecimal.
// Para convertir un numero a binario se hacen divisiones entre 2 y se guardan los restos;
// para convertir a octal
// se divide entre 8 y para convertir a hexadecimal se divide por 16
// (si el resto es 10 se sustituye por una A, si es 11 se sustituye por B, 12 -> C,&, 15->F).
// Cada método recibe un número entero y da como resultado un String con el número convertido.
//Ejemplo:
//Escribe un número: 58
//Dará como resultado:
//Binario : 111010
//Octal : 72
//Hexadecimal : 3ª
package Unidad2.ejercicio4;

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número: ");

            int numero = sc.nextInt();
            sc.close();

            System.out.println("Binario: " + decimalABinario(numero));
            System.out.println("Octal: " + decimalAOctal(numero));
            System.out.println("Hexadecimal: " + decimalAHexadecimal(numero));
        }

        public static String decimalABinario(int numero) {
            String resultado = "";
            while(numero > 0){
                int resto = numero % 2;
                resultado = resto + resultado;
                numero = numero / 2;
            }
            return resultado;
        }

        public static String decimalAOctal(int numero) {
            String resultado = "";
            while(numero > 0){
                int resto = numero % 8;
                resultado = resto + resultado;
                numero = numero / 8;
            }
            return resultado;
        }

        public static String decimalAHexadecimal(int numero) {
            String resultado = "";
            while(numero > 0){
                int resto = numero % 16;

                if(resto < 10){
                    resultado = resto + resultado;
                } else {
                    resultado = (char)('A' + (resto - 10)) + resultado;
                }

                numero = numero / 16;
            }
            return resultado;
        }
    }



