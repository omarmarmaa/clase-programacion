package Unidad4.EjerciciosBasadosEnZonasHorarias;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la fecha (dd/MM/yyyy)");
        String fechaTexto=scanner.nextLine();
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha= LocalDate.parse(fechaTexto,formato);
        LocalDate cumpleaños=LocalDate.now();

        Period espera=Period.between(fecha,cumpleaños);
        System.out.println("tu cumpleaños es en "+ espera);

        scanner.close();
    }
}
