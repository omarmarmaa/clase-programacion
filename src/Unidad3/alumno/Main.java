package Unidad3.alumno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        Alumno[] clase= new Alumno[3];
        for (int i=0; i< clase.length; i++){
            System.out.println("introduce un nombre");
            String n= scanner.next();
            System.out.println("introduce la nota");
            double nota = scanner.nextDouble();
            clase[i]= new Alumno(n,nota);

            if (nota < 5){
                System.out.println("le quieres aprobar? s/n");
                String s1=scanner.next();
                if ("s".equals(s1)){
                    clase[i].aprobar();
                }else {
                    System.out.println("pues se queda suspenso");
                }

            }
        }
        scanner.close();
    }
}
