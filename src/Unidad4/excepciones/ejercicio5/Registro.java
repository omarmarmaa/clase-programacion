package Unidad4.excepciones.ejercicio5;

public class Registro {
    public static void main(String[] args) {
        try {
            registrarEdad(-12);
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void registrarEdad(int edad) throws EdadInvalidaException {
        if (edad<0 || edad>120){
            throw new EdadInvalidaException("edad no valida");
        }
    }
}
