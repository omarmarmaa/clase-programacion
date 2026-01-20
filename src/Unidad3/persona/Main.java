package Unidad3.persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("escribe el nombre");
        String nombre= scanner.next();
        System.out.println("escribe la edad");
        int edad= scanner.nextInt();
        System.out.println("escibe el sexo");
        char sexo=scanner.next().charAt(0);
        System.out.println("escribe el peso");
        double peso= scanner.nextDouble();
        System.out.println("escribe la altura");
        double altura=scanner.nextDouble();
        double imc;
        Persona persona1= new Persona(nombre,edad,sexo,peso,altura);
        imc = persona1.calcularIMC();
        if (imc == -1) {
            System.out.println(persona1.getNombre() + " está por debajo de su peso ideal");
        } else if (imc == 0) {
            System.out.println(persona1.getNombre() + " está en su peso ideal");
        } else {
            System.out.println(persona1.getNombre() + " tiene sobrepeso");
        }

        System.out.println(persona1.getNombre() + " es mayor de edad? " + persona1.esMayorDeEdad());
        System.out.println(persona1);



        System.out.println("escribe el nombre");
        String nombre2= scanner.next();
        System.out.println("escribe la edad");
        int edad2= scanner.nextInt();
        System.out.println("escibe el sexo");
        char sexo2=scanner.next().charAt(0);


        Persona persona2= new Persona(nombre2,edad2,sexo2);
        System.out.println(persona2.getNombre() + " es mayor de edad? " + persona2.esMayorDeEdad());

        imc = persona2.calcularIMC();
        if (imc == -1) {
            System.out.println(persona2.getNombre() + " está por debajo de su peso ideal");
        } else if (imc == 0) {
            System.out.println(persona2.getNombre() + " está en su peso ideal");
        } else {
            System.out.println(persona2.getNombre() + " tiene sobrepeso");
        }

        System.out.println(persona2);

        System.out.println("escribe el nombre");
        String nombre3= scanner.next();
        Persona persona3= new Persona(nombre3);
        System.out.println(persona3.getNombre() + " es mayor de edad? " + persona3.esMayorDeEdad());
         imc = persona3.calcularIMC();
        if (imc == -1) {
            System.out.println(persona3.getNombre() + " está por debajo de su peso ideal");
        } else if (imc == 0) {
            System.out.println(persona3.getNombre() + " está en su peso ideal");
        } else {
            System.out.println(persona3.getNombre() + " tiene sobrepeso");
        }


        System.out.println(persona3);
        scanner.close();
    }
}
