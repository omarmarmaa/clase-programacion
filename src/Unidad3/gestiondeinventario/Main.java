package Unidad3.gestiondeinventario;

public class Main {
    public static void main(String[] args) {
        Producto libro=new  Producto("El nombre de la rosa",21.98,3);
        libro.mostrarinfo();
        libro.vender(1);
        libro.mostrarinfo();
        libro.reponer(-1);
        libro.mostrarinfo();
        libro.vender(4);

    }
}
