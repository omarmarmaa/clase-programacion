package Unidad5.Ejercicios3ListTiendaVideojuegos;

import java.util.UUID;

public class Videojuego {
    String titulo;
    String plataforma;
    String genero;
    double precio;
    int Stock;
    UUID uuid;

    public Videojuego(String titulo, String plataforma, double precio, String genero, int stock, UUID uuid) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.precio = precio;
        this.genero = genero;
        Stock = stock;
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", genero='" + genero + '\'' +
                ", precio=" + precio +
                ", Stock=" + Stock +
                ", uuid=" + uuid +
                '}';
    }
}
