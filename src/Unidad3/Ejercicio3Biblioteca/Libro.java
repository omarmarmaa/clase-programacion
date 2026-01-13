package Unidad3.Ejercicio3Biblioteca;

public class Libro {
    private String titulo;
    private Autor escritor;
    private  boolean prestado=false;

    public Libro(Autor escritor, String titulo) {
        this.escritor = escritor;
        this.titulo = titulo;
    }
    public void prestar(){
        if (!prestado) {
            prestado = true;
            System.out.println("has alquilado el titulo " + titulo);
        }else {
            System.out.println("Error "+ titulo + " no esta disponible");
        }
    }
    public void devolver() {
        if (prestado) {
            prestado = false;
        } else {
            System.out.println("El libro ya esta devuelto");
        }
    }
    public void informacion(){
        System.out.println(titulo + " " + escritor.mostrarAutor());
    }
}
