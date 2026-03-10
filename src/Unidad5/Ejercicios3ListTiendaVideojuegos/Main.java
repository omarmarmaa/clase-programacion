package Unidad5.Ejercicios3ListTiendaVideojuegos;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
     static List<Videojuego> videojuegos=new ArrayList<>();
     static List<Clientes> clientes=new ArrayList<>();
     static List<Venta> ventas=new ArrayList<>();

    public static void main(String[] args) {

    }
    public static void addtoInventary(Videojuego juego){
        videojuegos.add(juego);
    }
    public  static List inventario(){
        return videojuegos;
    }
    public static void consultarTitulo(String titulo){
        boolean Disponibilidad;
        for (Videojuego juego : videojuegos){
            if (juego.equals(titulo)){
                System.out.println("el stock de"+ titulo + " es de "+ juego.Stock);
                Disponibilidad=true;
            }else {
                Disponibilidad=false;
            }
        }
    }

}
