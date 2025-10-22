public class variablesGTAVI {
    public static void main(String[] args) {

        long dinero= 1000000000000000000L;
        float saldo = 12345.89f;

        // no se puede encajar decimal en entero
        //int numero= 1000.4f;
        double numero2=457.24f;
        double cantidad= 124;

        final int notaFinDeCurso;
        double examen1= 8;
        double examen2= 5;
        double media= (examen2+ examen1)/2;
        System.out.println(dinero);
        System.out.println("la media sería " + media);

        // casting
        notaFinDeCurso = (int) media;
        System.out.println("la notaFinDeCurso sería " + notaFinDeCurso);

        //Caracteres
        char inicial= 'G';
    }
}
