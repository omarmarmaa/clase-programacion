package Unidad3.rectangulo;

public class Main {
   public static void main(String[] args) {
        Rectangulo rectangulo=new Rectangulo(12, 3);
        rectangulo.valoresDimensiones();
        rectangulo.determinarRectangulo();
        System.out.println(" el area es "+ rectangulo.area());
        System.out.println(" el perimetro " + rectangulo.perimetro());
        rectangulo.rectanguloasteriscos();

    }
}
