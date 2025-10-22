package Unidad1.Ejercicio_1;

public class Ejercicio_9 {
    public static void main(String[] args) {
        int A = 2;
        int B = 3;
        int C = 4;
        int D = 5;

        B=C;
        System.out.println("Nuevo valor de B " + B);
        C=A;
        System.out.println("Nuevo valor de C " + C);
        A=D;
        System.out.println("Nuevo valor de A " + A);
        D=B;
        System.out.println("Nuevo valor de D " + D);
    }
}
