package Unidad3.Ejercicio3Biblioteca;


public class Main {
    public static void main(String[] args) {
        Autor autor=new Autor("Miguel De Cervantes", "Española");
        Libro libro=new Libro(autor,"Don Quijote");
        libro.prestar();
        libro.prestar();
        libro.informacion();
    }
}
