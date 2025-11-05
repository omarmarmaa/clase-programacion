package Unidad2.ejercicio4;

import java.util.Scanner;

//Realiza un método redondear() al que se le pasa como parámetro un numero float
// y los decimales que deben quedar después de redondear,
// y retorna el numero redondeado.
//Ejemplo: redondear( 234.49234 , 3 )
//Da como resultado : 234.492
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿cuantos decimales desea quitar?");
        int valor = scanner.nextInt();
        System.out.println("¿que numero desea redondear?");
        float numero = scanner.nextFloat();

        System.out.println("el numero no redondeado es " + numero);
        System.out.println("numero redondeado es " + redondeo(numero, valor));
    }

    public static float redondeo(float numero, int valor) {
        if (valor == 0) {
            return Math.round(numero);
        } else {
            float resultado = redondeo(numero, valor - 1);
            return resultado;
        }
    }
}


