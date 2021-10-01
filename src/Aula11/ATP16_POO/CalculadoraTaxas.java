package Aula11.ATP16_POO;


import java.util.Scanner;

public class CalculadoraTaxas {

    int qtdSaques = 0;
    double valor_conta;

    public void cabecalho() {
        System.out.println("=======CALCULADORA DE TAXAS=========\n");
    }

    public void menu() {
        System.out.println("Escolha a operação que deseja realizar:\n 1 - Depositar \n 2 - Sacar \n 3 -Transferir \n 4- Sair \n ----->");
    }


    int ler_numero(String mensagem) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensagem);
        int numero_lido = Integer.parseInt(sc.nextLine());
        return numero_lido;
    }


    public void imprimir_valores(double valor, double saque) {
        System.out.printf("Valor na conta: %d| Valor com taxa de transferência: %f | Valor com taxa se saque %.2f", valor, saque);
    }

    public double taxaTransferido(double valorTransf) {
        double taxa_transfer = valor_conta * (0.001 / 100);
        return taxa_transfer;
    }

    public double taxaSaque(double valorSaque) {
        int taxa_cont = 0;
        if (taxa_cont % 5 == 0) {
            double taxa_saque = valor_conta * 1.3;
            taxa_cont++;
            return taxa_saque;

        }
        return 0;
    }

    public void depositar(double deposito) {
        valor_conta += deposito;
    }


}


