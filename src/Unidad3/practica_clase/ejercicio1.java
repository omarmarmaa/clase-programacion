package Unidad3.practica_clase;

import java.util.Scanner;

//edad 18< , <18 ,>=25 , <60
//accidentes 30%
//tipo (3ros, todo riesgo) normal 1 y todo 1.20
//antiguedad > 5 = 0,05
//edad coche 5+ 1.3 10 + 1.1 ,15 + 1.15
//color 1n 11b + 1.07
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad = 500;
        System.out.println("introduzca su edad");
        int edad = scanner.nextInt();
        System.out.println("tuvo algun accidente");
        boolean accidentes = scanner.nextBoolean();
        System.out.println("cuanto tiempo lleva con el carnet?");
        int antiguedad = scanner.nextInt();
        System.out.println("digame la edad del coche");
        int edadCoche = scanner.nextInt();
        System.out.println("digame el color del coche");
        String color = scanner.next();
        System.out.println("que tipo de seguro nececita premium,intermedio,basico");
        String tipo = scanner.nextLine();

        seguro(cantidad, edad, accidentes, antiguedad, edadCoche, color, tipo);
        scanner.close();
    }

    public static double seguro(int cantidad, int edad, boolean accidente, int antiguedad, int edadCoche, String color, String tipo) {
        if (edad < 18) {
            return 0;
        } else if (edad >= 18) {
            if (antiguedad > 5) {
                if (accidente) {
                    if (edadCoche >= 8) {
                        if (color.equals("rojo")) {
                            return cantidad * 0.90;
                        } else {
                            return cantidad * 1.20;
                        }
                    } else {
                        return cantidad * 1.20;
                    }
                } else {
                    return cantidad;
                }
            } else {
                return cantidad;
            }
        } else {
            return 0;
        }
    }
}