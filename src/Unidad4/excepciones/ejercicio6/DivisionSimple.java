package Unidad4.excepciones.ejercicio6;

public class DivisionSimple {
    public static void main(String[] args) {
        try{
            realizarDivision("2","2");
        }catch (NumberFormatException e){
            System.out.println("no se puede dividir letras");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    public static void realizarDivision(String primero,String segundo){
        int guardado1=Integer.parseInt(primero);
        int guardado2=Integer.parseInt(primero);
        if (guardado1 ==0 || guardado2 ==0){
            throw new ArithmeticException("no sen puede dividir por 0");
        }
        double resultado= (double) guardado1/guardado2;
        System.out.println("el resultado de la division "+resultado);
    }
}
