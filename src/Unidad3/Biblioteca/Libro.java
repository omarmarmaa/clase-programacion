package Unidad3.Biblioteca;

public class Libro {
    private  String titulo;
    private  String autor;
    private  String editorial;
    private  int isbn ;
    private int fechaPublicacion;

    public Libro(String titulo,String autor, String editorial, int isbn, int fechaPublicacion){
        this.titulo=titulo;
        this.autor=autor;
        this.isbn=isbn;
        this.fechaPublicacion=fechaPublicacion;
        this.editorial=editorial;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(int fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        String comprobrarAutor=autor!= null ? autor:"sin autor";
        return
                titulo+ " " + isbn + " " + fechaPublicacion + " " + comprobrarAutor;
    }
}
