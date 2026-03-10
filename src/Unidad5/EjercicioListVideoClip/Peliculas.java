package Unidad5.EjercicioListVideoClip;

public class Peliculas extends VideoClub{
int codigo;
String titulo;

    public Peliculas(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
    public String getTitulo() {
        return titulo;
    }

}
