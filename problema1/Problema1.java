package problema1;
class Estudiante{
    private String nombreEst;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    public Estudiante(){
    }
    public Estudiante(String nombreEst, double nota1, double nota2,double nota3){
        this.nombreEst = nombreEst;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public void setNombreEstu(String nombreEst){
        this.nombreEst = nombreEst;
    }
    public String getNombreEst(){
        return nombreEst;
    }
    public void setNota1(double nota1){
        this.nota1 = nota1;
    }
    public double getNota1(){
        return nota1;
    }
    public void setNota2(double nota2){
        this.nota2 = nota2;
    }
    public double getNota2(){
        return nota2;
    }
    public void setNota3(double nota3){
        this.nota3 = nota3;
    }
    public double getNota3(){
        return nota3;
    }
    public double getPromedio(){
        return promedio;
    }
    public void calcularPromedio(){
        this.promedio = (this.getNota1()+this.getNota2()+this.getNota3())/3;
    }
    public String toString(){
        return String.format("NOTAS DEL ESTUDIANTE:\n"
                        +"\nNombre del estudiante:\n%s"
                        +"\nNota1:%.2f"
                        +"\nNota2:%.2f"
                        +"\nNota3:%.2f"
                        +"\nPromedio:%.2f"
                ,getNombreEst()
                , getNota1()
                ,getNota2()
                ,getNota3()
                ,getPromedio());
    }


}
public class Problema1 {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Lenin", 10, 10, 10);
        estudiante1.calcularPromedio();
        System.out.println(estudiante1);
    }

}