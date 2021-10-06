package Aula15.ATP21;

public class ContaCorrente {

    private double transfer_rate = 10.50;
    private double taxa_manutencao = 2.50;
    private int numbers_transfer = 0;


    public double getTransfer_rate() {
        return transfer_rate;
    }

    public void setTransfer_rate(double transfer_rate) {
        this.transfer_rate = transfer_rate;
    }

    public double getTaxa_manutencao() {
        return taxa_manutencao;
    }

    public void setTaxa_manutencao(double taxa_manutencao) {
        this.taxa_manutencao = taxa_manutencao;
    }

    public int getNumbers_transfer() {
        return numbers_transfer;
    }

    public void setNumbers_transfer(int numbers_transfer) {
        this.numbers_transfer = numbers_transfer;
    }


}
