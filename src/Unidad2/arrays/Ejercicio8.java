package Unidad2.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {

        int[][] cuadro = {
                {15, 8, 1, 24, 17},
                {16, 14, 7, 5, 23},
                {22, 20, 13, 6, 4},
                {3, 21, 19, 12, 10},
                {9, 2, 25, 18, 11}
        };

        int n = 5;


        int sumaObjetivo = 0;
        for (int j = 0; j < n; j++) {
            sumaObjetivo += cuadro[0][j];
        }

        boolean esMagico = true;


        for (int i = 0; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < n; j++) {
                sumaFila += cuadro[i][j];
            }
            if (sumaFila != sumaObjetivo) esMagico = false;
        }


        for (int j = 0; j < n; j++) {
            int sumaCol = 0;
            for (int i = 0; i < n; i++) {
                sumaCol += cuadro[i][j];
            }
            if (sumaCol != sumaObjetivo) esMagico = false;
        }


        int diag1 = 0;
        for (int i = 0; i < n; i++) {
            diag1 += cuadro[i][i];
        }
        if (diag1 != sumaObjetivo) esMagico = false;


        int diag2 = 0;
        for (int i = 0; i < n; i++) {
            diag2 += cuadro[i][n - 1 - i];
        }
        if (diag2 != sumaObjetivo) esMagico = false;


        if (esMagico)
            System.out.println("es un cuadro mágico.");
        else
            System.out.println("no es un cuadro mágico.");
    }
}
