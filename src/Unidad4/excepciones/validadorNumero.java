package Unidad4.excepciones;

import java.util.IllformedLocaleException;

public class validadorNumero {
    public static void main(String[] args) {
        validarPositivo(-1);
    }
    public  static void validarPositivo(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("el numero debe ser positivo.");
        }
        System.out.println("numero valido " + a);
    }
}