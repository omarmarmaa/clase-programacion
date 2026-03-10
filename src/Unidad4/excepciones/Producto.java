package Unidad4.excepciones;

public class Producto {
    public static void main(String[] args) {
        establecerPrecio(-2);
    }
    public static void establecerPrecio(double precio){
        if(precio<0){
            throw  new IllegalArgumentException("no has introducido un valor positivo");
        }
    }
}
