package Unidad3;

//datos 500€ > 18 && <25 +20%
//>35 && <55 && -10%  && !accidentes
// 65 && !accidente +10%
//65 && accidente +30%

import java.util.Scanner;

public class examenpractica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dame la edad");
        int edad = scanner.nextInt();
        double precioInicial = 500;
        System.out.println("¿has tenido un accidente? true/false");
        boolean accidentes = scanner.hasNextBoolean();
        double preciofinal = precioseguro(edad, precioInicial, accidentes);
        System.out.println(preciofinal);
        scanner.close();
    }

    public static double precioseguro(int edad, double precioInicial, boolean accidentes) {
        if (edad > 18 && edad < 25) {
            return precioInicial * 1.20;
        } else if (edad > 35 && edad < 55) {
            return precioInicial * 0.90;
        } else if (edad > 65 && !accidentes) {
            return precioInicial * 1.10;
        } else if (edad > 65 && accidentes) {
            return precioInicial * 1.30;
        } else {
            return precioInicial;
        }
    }
}
