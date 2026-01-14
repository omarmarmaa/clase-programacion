package Unidad3.AvilaExpress;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private Double capacidadCarga;
    private  boolean enMision;
    int distancia;

    public NaveEspacial(String nombre) {
        this.nombre = nombre;
        capacidadCarga= 6.0;
    }

    public NaveEspacial(String nombre, Double capacidadCarga) {
        this.nombre = nombre;
        this.capacidadCarga = capacidadCarga;
        combustible=100;
        enMision=false;
    }
    public void mostrarEstado(){
        System.out.println(" * nombre de la nave " + nombre + " * cantidad de combustible " + combustible + " * capacidad de carga " + capacidadCarga + " * estado de mision " + enMision + " * ");
    }
    public void viajar(int distancia){
        if (combustible - (distancia * 2) > 0){
            enMision=true;
            combustible-=distancia*2;
        }else {
            System.out.println("combustible insuficiente para la mision");
        }
    }
    public void repostar(){
        combustible=100;
        enMision=false;
    }

    public int getCombustible() {
        return combustible;
    }
}

