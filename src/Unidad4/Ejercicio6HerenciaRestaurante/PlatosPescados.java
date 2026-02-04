package Unidad4.Ejercicio6HerenciaRestaurante;

public class PlatosPescados extends Platos {

    public PlatosPescados(String nombre, double precio) {
        super(nombre, precio);

    }

    @Override
    public String toString() {
        return "PlatosPescados{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
