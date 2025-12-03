package Unidad2.arrays.repaso;

public class Ejercicio7 {
    public static void main(String[] args) {
        double base=2;
        double altura=3;
        double resultado=areaRectangulo(base,altura);
        System.out.println(resultado);
        System.out.println("¿es par? "+ espar(resultado));
    }
    public  static  double areaRectangulo(double base, double altura){
        return base*altura;
    }
    static  boolean espar(double resultado){
        if (resultado%2==0){
            return true;
        }else {
            return false;
        }
    }
}
