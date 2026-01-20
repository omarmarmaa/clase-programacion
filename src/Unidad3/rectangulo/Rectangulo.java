package Unidad3.rectangulo;
/*
Escribe una clase llamada Rectángulo que posea dos atributos de tipo entero llamados largo y ancho.
La clase debe poseer los siguientes métodos:
Un método constructor que no reciba ningún parámetro y que inicialice las dimensiones del rectángulo (largo y ancho) con dos enteros positivos por defecto.
Otro método constructor que reciba el ancho y el largo como parámetros. Se debe chequear que ambos valores sean positivos antes de asignárselos a los atributos correspondientes. En caso contrario, se asignarán valores por defecto.
Métodos get y set para la clase. Los métodos set deben chequear que las nuevas dimensiones efectivamente sean enteros positivos.
Un método que calcule y retorne el área del rectángulo.
Método que calcule y retorne el perímetro del rectángulo.
Otro método que determine si el rectángulo es horizontal o vertical. Decimos que el rectángulo es horizontal si el valor del largo es mayor que el del ancho. En caso contrario, decimos que el rectángulo es vertical.
Un método que despliegue en pantalla los valores de las dimensiones (largo y ancho) del rectángulo.
Otro método que dibuje en pantalla el rectángulo mediante asteriscos, utilizando tantas columnas como valor tenga el largo y tantas filas como valor tenga el ancho. Por ejemplo, si el ancho valiera 3 y el largo valiera 12, se debería desplegar así:
************
************
************
P=2(largo+ancho)
 */
public class Rectangulo {
    int largo;
     int ancho;

    public Rectangulo() {
        this(12,3);
    }
    //get cojo los valores de las variables
    public int getLargo() {
        return largo;
    }

    public int getAncho() {
        return ancho;
    }
    // validamo datos


    public void setLargo(int largo) {
        if (largo>0) {
            this.largo = largo;
        }else {
            System.out.println("el largo debe ser positivo");
        }
    }
    public void setAncho(int ancho) {
        if (ancho>0) {
            this.ancho = ancho;
        }else {
            System.out.println("el ancho debe ser positivo");
        }
    }
    //asignacion de valores por defecto
    public Rectangulo(int largo, int ancho) {
        if (largo > 0 && ancho > 0) {
            this.largo = largo;
            this.ancho = ancho;
        } else {
            this.largo =  12;
            this.ancho =  3;
        }
    }


    public int area(){
        return largo*ancho;
    }
    public int perimetro(){
            return 2*(largo+ancho);
    }

    public  void determinarRectangulo(){
        if (ancho>largo){
            System.out.println("Es horizontal");
        } else if (ancho==largo) {
            System.out.println("Es cuadrado");
        } else{
            System.out.println("es vertical");
        }
    }
    public  void valoresDimensiones(){
        System.out.println(" largo "+largo+" ancho "+ancho);
    }
    public void rectanguloasteriscos(){
        for (int i=0; i<largo; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
