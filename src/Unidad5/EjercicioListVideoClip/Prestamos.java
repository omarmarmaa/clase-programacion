package Unidad5.EjercicioListVideoClip;

import java.time.LocalDate;

public class Prestamos extends VideoClub {
    Peliculas peliculas;
    Clientes clientes;
    LocalDate FechaDevoluciom;

    public Prestamos(Peliculas peliculas, Clientes clientes, LocalDate fechaDevoluciom) {
        this.peliculas = peliculas;
        this.clientes = clientes;
        FechaDevoluciom = fechaDevoluciom;
    }

    public void setPeliculas(Peliculas peliculas) {
        this.peliculas = peliculas;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public void setFechaDevoluciom(LocalDate fechaDevoluciom) {
        FechaDevoluciom = fechaDevoluciom;
    }

    public Peliculas getPeliculas() {
        return peliculas;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public LocalDate getFechaDevoluciom() {
        return FechaDevoluciom;
    }
}
