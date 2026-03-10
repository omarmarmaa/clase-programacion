package Unidad4.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try{
            int numero= scanner.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("accion incorrecta");
        }finally {
            scanner.close();
        }

    }
}
