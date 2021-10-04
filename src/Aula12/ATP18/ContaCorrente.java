package Aula12.ATP18;

public class ContaCorrente {


    private int agencia;
    private long num_conta;
    private String codigo_cliente;
    private double saldo;


    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public long getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(long num_conta) {
        this.num_conta = num_conta;
    }

    public String getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
