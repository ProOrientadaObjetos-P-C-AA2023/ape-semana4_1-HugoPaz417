package problema2;
class Profesores{
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    public Profesores(){}
    public Profesores(String nombre,String apellido,double sueldoBasico,String cedula ){
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico =sueldoBasico;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public void setSueldoTotal(double sueldoTotal) {
        this.sueldoTotal = sueldoTotal;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public void calcularSueldoTotal(){
        this.sueldoTotal = (this.getSueldoBasico()+this.getSueldoBasico()*1.2);
    }
    @Override
    public String toString(){
        return String.format("PROFESORES DE INSTITUCION:\n"
                        +"\nNombre:%s"
                        +"\nApellido:%s"
                        +"\nSueldoBasico:%.2f"
                        +"\nSueldoTotal:%.2f"
                        +"\nCedula:%s"
                ,getNombre()
                ,getApellido()
                ,getSueldoBasico()
                ,getSueldoTotal()
                ,getCedula());
    }
}
public class Problema2 {
    public static void main(String[] args) {
        Profesores profesor1=new Profesores("Oscar","Cañellas",450.0,"110589682");
        profesor1.calcularSueldoTotal();
        System.out.println(profesor1);


    }

}