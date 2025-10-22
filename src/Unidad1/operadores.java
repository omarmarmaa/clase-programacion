public class operadores {
    public static void main(String[] args) {
        //Operadores aritmeticos
        /*
        entrada número
        salida número
         */
        int numero1 =13;
        numero1=numero1 + 2;
        numero1 = numero1 * 2;
        numero1=numero1 - 50 / 2;
        System.out.println("numero1 vale " + numero1);
        numero1 = numero1 + 5;

        // ahora numero1 vale 10

        int numero2 = numero1 % 3;

        // operadores de asignación
        int otroNumero = 3;
        otroNumero -= 2;
        System.out.println("otroNumero " + otroNumero);

        //operadores de incremento
        int edad = 22;
        System.out.println("edad " + edad);
        // suma 1
        edad++;

        System.out.println("edad2 " + edad);
        // importante examen posicion del ++ depende la posuicion aumenta antes o despues 
        System.out.println("edad3 " + ++edad);
        System.out.println("edad4 " + edad);
    }
}
