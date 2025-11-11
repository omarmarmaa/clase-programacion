package Unidad2.arrays;

import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        int notaPrimerExamenCARLA = 7;
        int notaSegundoExamenCARLA = 6;

        int[] notasCarla = new int[3];
        notasCarla[0] = 7;
        notasCarla[1] = 9;
        notasCarla[2] = 5;
        System.out.println(Arrays.toString(notasCarla));
        //para incrementar sin modificar el anterior array
        int[] notasCarlaAuxiliares = notasCarla;
        notasCarla = new int[4];
        for (int i = 0; i < notasCarlaAuxiliares.length; i++) {
            notasCarla[i] = notasCarlaAuxiliares[i];
        }
        notasCarla[3] = 9;
        System.out.println("notasCarla :: " + Arrays.toString(notasCarla));
        System.out.println("notasCarlaAuxiliares :: " + Arrays.toString(notasCarlaAuxiliares));
        // ya tenemos en notasCarla los 4 valores

        int[] otra = notasCarla;
        otra[3] = 1;
        System.out.println("otra ::" + Arrays.toString(otra));
        //cuidado y ojo con esto
        System.out.println("notasCarla :: " + Arrays.toString(notasCarla));

        //Inicializacion
        int[] masNotas = {4, 5, 6, 7};
        System.out.println("masNotas :: " + Arrays.toString(masNotas));
    }
}
