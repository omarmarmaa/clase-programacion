package Unidad2.ejercicio1;

//Muestra los números del 1 al 100 (ambos incluidos)
// divisibles entre 2 y 3.
// Utiliza el bucle que desees
public class Ejercicio11 {
    public void main(String[] args) {

        int numero = 1;
        while (numero <= 100) {
            numero++;
            if (numero % 2 == 0 && numero % 3 == 0) {
                System.out.println(numero);
            }
        }

    }
}
