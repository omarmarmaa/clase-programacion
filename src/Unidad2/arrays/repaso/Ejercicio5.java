package Unidad2.arrays.repaso;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[][] notas= new int[2][3];
        notas[0][0]=5;
        notas[0][1]=6;
        notas[0][2]=7;
        notas[1][0]=6;
        notas[1][1]=8;
        notas[1][2]=6;
        int suma=0;
        //recorrer
        for (int i=0;  i< notas.length; i++){
            for (int j=0; j< notas[i].length; j++){
                System.out.println(" notas "+ " [ " + i + " ] " + "[ "+ j + " ] " + " = "+ notas[i][j]);
               suma += notas[i][j];
            }
        }
        System.out.println(suma);
    }
}
