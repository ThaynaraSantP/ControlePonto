public class Operador extends Funcionario {

   private double valorHora;

    public double getValorHora() {
        return valorHora; }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora; }

    @Override
    public String apresentarFuncionario() {
        StringBuffer text = new StringBuffer();
        text.append(super.apresentarFuncionario());
        text.append("ValorHr: " + valorHora + " | ");
        return text.toString();
    }


}
