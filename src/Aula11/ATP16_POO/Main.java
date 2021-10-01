package Aula11.ATP16_POO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CalculadoraTaxas calculadoraTaxas = new CalculadoraTaxas();

        calculadoraTaxas.cabecalho();
        calculadoraTaxas.menu();
        double saldo = 200;


        int opcao = calculadoraTaxas.ler_numero("Escolha a operação que deseja realizar: ");


            switch (opcao) {

                case 1:
                    System.out.println("Digite o valor de depósito: ");
                    double deposito_conta = scanner.nextDouble();
                    calculadoraTaxas.depositar(deposito_conta);
                    System.out.println("Valor total com deposito: " + (deposito_conta + saldo) );
                    break;

                case 2:
                    System.out.println("Digite o valor de transferência: ");
                    double valor_conta = scanner.nextDouble();
                    System.out.println(calculadoraTaxas.taxaSaque(valor_conta));
                    break;

                case 3:
                    System.out.println("Digite o valor de saque: ");
                    double conta = scanner.nextDouble();
                    System.out.println(calculadoraTaxas.taxaTransferido(conta));
                    break;

                case 4:
                    System.out.println("Até breve!");
                    break;

                default:
                    System.out.println("Número inválido, digite novamente");
                    break;
            }
        }
}





