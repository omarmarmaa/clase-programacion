package Unidad3.AvilaExpress;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NaveEspacial[] garage=new NaveEspacial[3];
        NaveEspacial naveEspacial1 =new NaveEspacial("nave1", 4.0);
        NaveEspacial naveEspacial2=new NaveEspacial("nave2", 5.0);
        NaveEspacial naveEspacial3=new NaveEspacial("nave3", 6.0);

        garage[0]=naveEspacial1;
        garage[1]=naveEspacial2;
        garage[2]=naveEspacial3;
        naveEspacial1.viajar(30);
        naveEspacial2.viajar(60);

        for (int i=0; i< garage.length; i++){
            garage[i].mostrarEstado();

        }

        garage[0].repostar();

        for (int i=0; i< garage.length; i++){
            garage[i].mostrarEstado();

        }
        int nave1 = garage[0].getCombustible();
        int nave2 = garage[1].getCombustible();
        int nave3 = garage[2].getCombustible();

        if (nave1>=nave2 && nave1>=nave3){
            System.out.println(" nave1 "+nave1);
        } else if (nave2>=nave1 && nave2>nave3) {
            System.out.println("nave2 " + nave2);
        }else {
            System.out.println(" nave3 " +nave3);
        }
    }
}
