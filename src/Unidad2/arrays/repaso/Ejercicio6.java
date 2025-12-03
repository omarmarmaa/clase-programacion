package Unidad2.arrays.repaso;

public class Ejercicio6 {
    public static void main(String[] args) {
        String saludo= "Hola DAM1";

        saludar(saludo);
        int a=1;
        int b=2;
        int resultado=suma(a,b);
        System.out.println(resultado);
    }
    public static  void saludar(String saludo){
        System.out.println(saludo);
    }
    public static int suma(int a, int b){
        return a + b;
    }
}
