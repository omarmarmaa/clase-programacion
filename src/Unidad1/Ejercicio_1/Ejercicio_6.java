package Unidad1.Ejercicio_1;

public class Ejercicio_6 {
    public static void main(String[] args) {
        int variableN=5;
        double variableA=5.33;
        char variableC='D';
        int numero = (int) variableC;
        double resultado=0;

        //suma
        resultado=variableN + variableA;
        System.out.println("la suma de variableN + variableA = " + resultado );
        //resta
        resultado=variableA - variableN;
        System.out.println("La resta de variableN - variableA = " + resultado);
        //valor numerico
        System.out.println("el valor numerico de D = " + numero);
    }
}
