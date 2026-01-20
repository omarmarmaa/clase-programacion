package Unidad3.gimnasio;

public class Socio {
    static int contadorSocios=0;

    private String nombre;
    private int id;
    public  Socio(String nombre){
        this.nombre=nombre;
        contadorSocios++;
        this.id=contadorSocios;

    }
    public static  int getContadorSocios(){
        return contadorSocios;
    }
}
