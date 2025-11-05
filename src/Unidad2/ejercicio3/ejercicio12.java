package Unidad2.ejercicio3;

//Crea un método mostrar para imprimir: un String, un int, un double.
public class ejercicio12 {
    public static void main(String[] args) {

        String saludo = "hola";
        int a = 1;
        double b = 4;


        System.out.println(entero(a));
        System.out.println(decimal(b));
        letras(saludo);

    }

    public static void letras(String saludo) {
        System.out.println(saludo);
    }

    public static int entero(int a) {
        return a;
    }

    public static double decimal(double b) {
        return b;

    }
}
