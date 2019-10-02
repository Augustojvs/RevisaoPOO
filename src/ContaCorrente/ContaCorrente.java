package ContaCorrente;

public class ContaCorrente {

    private int agencia;
    private int conta;
    private double saldo;

    public String imprime() {
        return "Agencia: " + this.agencia + " \nConta: " + this.conta + " \nSaldo: " + this.saldo;
    }

    public double sacar(double valor) {
        if (valor > this.saldo || valor < 0) {
            System.out.println("saldo indisponivel");
        }
        return this.saldo - valor;

    }
}
