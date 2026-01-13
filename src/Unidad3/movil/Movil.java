package Unidad3.movil;

public class Movil {
    String marca;
    int bateria;
    boolean estaBloqueado;

    public Movil() {
        this("generico",100);
    }

    public Movil(String marca, int bateria) {
        this.marca =marca;
        this.bateria=bateria;
    }
    public static void llamar(){
        System.out.println("llamando...");
    }
}
