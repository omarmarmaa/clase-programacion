package Unidad3.alumno;

public class Alumno {
    private String nombre;
    private  double nota;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public double aprobar(){
        if (nota<=5){
            return 5;
        }else {
            return nota;
        }
    }
    public  void  imprimir(String nombre, double nota){
        System.out.println("el alumno "+ nombre +"tiene un "+ nota);
    }
}
