package Unidad5.EjercicioListVideoClip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VideoClub {
    static List<Clientes> clientes = new ArrayList<>();
    static List<Peliculas>  peliculas = new ArrayList<>();
    static List<Prestamos> prestamos = new ArrayList<>();
    public VideoClub() {

    }

    public static void main(String[] args) {

    }
    public static void  añadircliente(Clientes cliente ){
        clientes.add(cliente);
    }
    public  static  void añadirPelicula(Peliculas pelicula){
        peliculas.add(pelicula);
    }

    public  static  void añadirPrestamos(Prestamos prestamo){
        prestamos.add(prestamo);
    }


}
