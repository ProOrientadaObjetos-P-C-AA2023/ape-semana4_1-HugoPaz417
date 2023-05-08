package problema3;
class Automotor{
    private String cedulaDnio;
    private String marcaAuto;
    private int  anioFab;
    private double valorAuto;
    private double valorMat;
    public Automotor(){}
    public Automotor(String cedulaDnio, String marcaAuto, int anioFab, double valorAuto){
        this.cedulaDnio = cedulaDnio;
        this.marcaAuto = marcaAuto;
        this.anioFab = anioFab;
        this.valorAuto = valorAuto;
    }
    public String getCedulaDnio() {
        return cedulaDnio;
    }
    public void setCedulaDnio(String cedulaDnio) {
        this.cedulaDnio = cedulaDnio;
    }
    public String getMarcaAuto() {
        return marcaAuto;
    }
    public void setMarcaAuto(String marcaAuto) {
        this.marcaAuto = marcaAuto;
    }
    public int getAnioFab() {
        return anioFab;
    }
    public void setAnioFab(int anioFab) {
        this.anioFab = anioFab;
    }
    public double getValorAuto() {
        return valorAuto;
    }
    public void setValorAuto(double valorAuto) {
        this.valorAuto = valorAuto;
    }
    public double getValorMat() {
        return valorMat;
    }
    public void setValorMat(double valorMat) {
        this.valorMat = valorMat;
    }
    public void calcularValorMatricula(){
        int antiguedad = 2023-this.anioFab;
        double porcentaje = 0.00002;
        this.valorMat = this.valorAuto * porcentaje * antiguedad;
    }
    @Override
    public String toString(){
        return String.format("CARACTERISTICAS DEL AUTOMOTOR:"
                        +"\nCedula del duenio: %s"
                        +"\nMarca del Vehiculo: %s"
                        +"\nAnio de fabricacion: %d"
                        +"\nValor del vehiculo $: %.2f"
                        +"\nValor de la Matricula $: %.2f"
                ,getCedulaDnio()
                ,getMarcaAuto()
                ,getAnioFab()
                ,getValorAuto()
                ,getValorMat());
    }
}
public class Problema3 {
    public static void main(String[] args) {
        Automotor automotor1 = new Automotor("5543643726","Kia",2020,35000.0);
        automotor1.calcularValorMatricula();
        System.out.println(automotor1);

    }
}