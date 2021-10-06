package Aula15.ATP21;

public class ContaCorrente extends Conta{

    private double transfer_rate = 10.50;
    private double taxa_manutencao = 2.50;
    private int numbers_transfer = 0;

    @Override
    public void transfer(double value) {
        super.transfer(value);
        double saldoAtual = this.getBalance() - transfer_rate;
        this.setBalance(saldoAtual);

        numbers_transfer++;
        if(numbers_transfer %5 ==0){
            saldoAtual = this.getBalance() - taxa_manutencao;
            this.setBalance(saldoAtual);
        }
    }
}
