package Unidad2.Arrays;

public class Ejercicio9 {
    public static void main(String[] args) {

        int[] A = {4, 8, 15, 22, 25, 40};
        int[] B = {3, 6, 18, 21, 25, 47};

        int n = A.length;
        int[] C = new int[n * 2];

        int i = 0;
        int j = 0;
        int k = 0;


        while (i < n && j < n) {
            if (A[i] < B[j]) {
                C[k] = A[i];
                i++;
            } else {
                C[k] = B[j];
                j++;
            }
            k++;
        }


        while (i < n) {
            C[k] = A[i];
            i++;
            k++;
        }


        while (j < n) {
            C[k] = B[j];
            j++;
            k++;
        }


        System.out.print("Array  ");
        for (int x = 0; x < C.length; x++) {
            System.out.print(C[x] + " ");
        }
    }
}
