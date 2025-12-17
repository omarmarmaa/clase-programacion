package Unidad3.calculoCirculo;
//P = 2πr
//A = π * r²
public class circulo {
    private double radio;


    public circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "circulo{" +
                "radio=" + radio +
                '}';
    }
    public double perimetro(double radio){
        return 2*Math.PI*radio;
    }
}
