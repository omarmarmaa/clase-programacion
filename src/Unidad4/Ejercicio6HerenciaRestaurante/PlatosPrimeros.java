package Unidad4.Ejercicio6HerenciaRestaurante;

public class PlatosPrimeros extends Platos{
    boolean compartirEnMesa;

    public PlatosPrimeros(String nombre, double precio, boolean compartirEnMesa) {
        super(nombre, precio);
        this.compartirEnMesa = compartirEnMesa;
    }

    @Override
    public String toString() {
        return "PlatosPrimeros{" +
                "compartirEnMesa=" + compartirEnMesa +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
