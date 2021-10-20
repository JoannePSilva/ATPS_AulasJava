package Aula16.ATP22.Exercicio2;

public class ContaCorrente {

    private double saldo;
    private double taxa_saque = 15.00;
    private String codigo_cliente;

    public ContaCorrente(double saldo, String codigo_cliente) {
        this.saldo = saldo;
        this.codigo_cliente = codigo_cliente;
    }

    public double saque(double saque){
        this.saldo -= saque + this.taxa_saque;
        return this.saldo;
    }

    public void deposito(double valor) {
        this.saldo+=  valor;
    }

    @Override
    public String toString() {
        return "Saldo:" + saldo + "| Taxa_saque: " + taxa_saque + "| Código_cliente: " + codigo_cliente;
    }

}

