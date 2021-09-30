package Aula11.ATP6_POO;

import java.util.Scanner;

public class CalculadoraTaxas {


        double valor_conta = 100.00;

    public double taxaTransferido(double valor, double valor1) {
        double taxa_transfer = valor_conta * 0.001;
        return taxa_transfer;
    }

    public void taxaSaque() {
        int taxa_cont = 0;
        if (taxa_cont > 5) {
            double taxa_saque = valor_conta * 1.3;
            taxa_cont++;

        }
    }
    public void imprimir_valores(){
        System.out.println("Valor na conta: %d| Valor com taxa de transferência: %f | Valor com taxa se saque %.2f");
    }
}
