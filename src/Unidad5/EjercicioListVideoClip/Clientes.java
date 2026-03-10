package Unidad5.EjercicioListVideoClip;

public class Clientes extends VideoClub
{
    int numeroCarnet;
    String nombre;

    public Clientes(int numeroCarnet, String nombre) {
        this.numeroCarnet = numeroCarnet;
        this.nombre = nombre;
    }

    public void setNumeroCarnet(int numeroCarnet) {
        this.numeroCarnet = numeroCarnet;
    }

    public int getNumeroCarnet() {
        return numeroCarnet;
    }

    public String getNombre() {
        return nombre;
    }
}
