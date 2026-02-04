package Unidad4.Ejercicio6HerenciaRestaurante;

public class PlatosPostres extends Platos {
    boolean postresConOsinAzucar;

    public PlatosPostres(String nombre, double precio, boolean postresConOsinAzucar) {
        super(nombre, precio);
        this.postresConOsinAzucar = postresConOsinAzucar;
    }

    @Override
    public String toString() {
        return "PlatosPostres{" +
                "postresConOsinAzucar=" + postresConOsinAzucar +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
