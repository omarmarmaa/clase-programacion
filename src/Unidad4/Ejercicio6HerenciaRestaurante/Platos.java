package Unidad4.Ejercicio6HerenciaRestaurante;

public class Platos {
    String nombre;
    double precio;

    public Platos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Platos{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
