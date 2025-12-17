package Unidad3.calculoCirculo;

public class prueba {
    public static void main(String[] args) {
        circulo c1=new circulo(2.4);
        System.out.println(c1);
        System.out.println(c1.perimetro(c1.getRadio()));
    }
}
