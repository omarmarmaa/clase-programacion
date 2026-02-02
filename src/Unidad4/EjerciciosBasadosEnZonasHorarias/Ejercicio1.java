package Unidad4.EjerciciosBasadosEnZonasHorarias;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio1 {
    public static void main(String[] args) {
        LocalDate examen=LocalDate.of(2025,6,30);
        LocalDate fecha=LocalDate.now();
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd 'de 'MM 'de' yyyy");
        System.out.println(" Hoy es "+ examen.getDayOfWeek()+", " + " "+ fecha.format(formato));
    }
}
