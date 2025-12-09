package Unidad3.Objetos;

public class Ejercicio3 {
    public static void main(String[] args) {
        StringBuilder nueva=new StringBuilder();
        for (int i=1; i<=10; i++){
            nueva.append(i).append("-");
        }
        System.out.print(nueva.subSequence(0,nueva.length()-1));
    }
}
