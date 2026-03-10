package Unidad5.Ejercicios3ListTiendaVideojuegos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta {
    Clientes clientes;
    List<Videojuego> videojuegos=new ArrayList<>();
    LocalDate fechaVenta;

    public Venta(Clientes clientes, List<Videojuego> videojuegos, LocalDate fechaVenta) {
        this.clientes = clientes;
        this.videojuegos = videojuegos;
        this.fechaVenta = fechaVenta;
    }
}
