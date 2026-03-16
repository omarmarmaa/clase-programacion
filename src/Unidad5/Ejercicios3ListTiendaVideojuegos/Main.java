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
    public static Clientes BuscarCliente(String nombre){
        for (Clientes actual:clientes){
            if (actual.nombre.equals(nombre)){
                return actual;
            }
        }
        return null;
    }
    public static Clientes BuscarCliente2(String apellido){
        for (Clientes actual:clientes){
            if (actual.apellidos.equals(apellido)){
                return actual;
            }
        }
        return null;
    }

    public static Clientes BuscarCliente3(String email){
        for (Clientes actual:clientes){
            if (actual.email.equals(email)){
                return actual;
            }
        }
        return null;
    }

    public static void RegistrarVent (Venta vent){
        ventas.add(vent);
        System.out.println("se ha registrado correctamente");
       for(Videojuego juego: videojuegos){
        vent.videojuegos.equals(juego);
        juego.Stock-=1;
       }
    }

    public static void historialVentas(){

    }
}
