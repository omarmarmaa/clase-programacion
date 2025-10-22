public class operadorTemario {
    public static void main(String[] args) {

        boolean tengoEfectivo = false;
        boolean tengoTarjeta = true;

        String puedoPagar = tengoEfectivo && tengoTarjeta ? "si" : "No";
        System.out.println("puedo pagar " + puedoPagar);
    }
}
