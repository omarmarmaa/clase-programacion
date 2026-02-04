package Unidad4.Ejercicio6HerenciaRestaurante;

public class PlatosCarnes extends Platos{
    String gradoCoccion;

    public PlatosCarnes(String nombre, double precio, String gradoCoccion) {
        super(nombre,precio);
        this.gradoCoccion = gradoCoccion;
    }

    @Override
    public String toString() {
        return "PlatosCarnes{" +
                "gradoCoccion='" + gradoCoccion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
