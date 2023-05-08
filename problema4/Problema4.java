package problema4;
class Cheque{
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comision;
    public Cheque(){}
    public Cheque(String nombreCliente, String nombreBanco, double valorCheque){
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    public void calcularComision(){
        this.comision = this.valorCheque * 0.00003;
    }
    @Override
    public String toString(){
        return String.format("BANCO FINANCIERO EN CHEQUES:"
                        +"\nNombre del Cliente:%s"
                        +"\nNombre del Banco:%s"
                        +"\nValor del Cheque:%.2f"
                        +"\nComision:%.2f"
                ,getNombreCliente()
                ,getNombreBanco()
                ,getValorCheque()
                ,getComision());
    }
}
public class Problema4 {
    public static void main(String[] args) {
        Cheque cheque1 = new Cheque("Hugo","Banco de Loja",13000);
        cheque1.calcularComision();
        System.out.println(cheque1);
    }

}