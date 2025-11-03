package Unidad3.ejercicio1;


import java.util.Scanner;
// Sobrecarga sumar: crea versiones que sumen dos, tres y cuatro enteros.
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿cuantos numeros deseas sumar?");
        int valor =scanner.nextInt();

        int resultado= 0;

        switch (valor) {
            case 2:
            System.out.println("ingrese el primer valor");
            int a=scanner.nextInt();
            System.out.println("ingrese el segundo valor");
            int b=scanner.nextInt();
            resultado=sumar(a,b);
            break;
            case 3:
                System.out.println("ingrese el primer valor");
                a=scanner.nextInt();
                System.out.println("ingrese el segundo valor");
                b=scanner.nextInt();
                System.out.println("ingrese el tercer valor");
                int c=scanner.nextInt();
                resultado=sumar(a,b,c);
            case 4:
                System.out.println("ingrese el primer valor");
                a=scanner.nextInt();
                System.out.println("ingrese el segundo valor");
                b=scanner.nextInt();
                System.out.println("ingrese el tercer valor");
                c=scanner.nextInt();
                System.out.println("ingrese el cuarto valor");
                int d=scanner.nextInt();
                resultado=sumar(a,b,c,d);
        }

        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }
    public static int sumar(int a,int b){
        return a+b;


    }
    public static int sumar(int a,int b,int c){
    return a+b+c;

    }
    public static int sumar(int a,int b,int c,int d){
    return a+b+c+d;
    }

}
