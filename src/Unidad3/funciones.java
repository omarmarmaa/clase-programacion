package Unidad3;

public class funciones {
     public static void main(String[] args){
         int edad=74;

         if (edad>65){
             System.out.println("Enhorabuena, estás jubilado, su billete a benidorm");
             float pension = calculameLaPension(edad);
             System.out.println("y su pensión es de " + pension);
         }
         // NO se puede
         //System.out.println(pension);
    }

    static float calculameLaPension(int edad) {
        return edad * 34;
    }
}
