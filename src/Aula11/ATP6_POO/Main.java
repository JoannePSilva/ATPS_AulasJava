package Aula11.ATP6_POO;

import Aula11.Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("====CALCULADORA DE TAXAS=====");
        System.out.println( "Escolha a operação que deseja realizar:\n 1 - Depositar \n 2 - Sacar \n 3 -Transferir \n 4- Sair");
        int opcao = scanner.nextInt();

        switch (opcao){

            case 1:
                System.out.println("Ainda vamos implementar :0)");
                break;

            case 2:
                System.out.println("Ainda vamos implementar :0)");
                break;

            case 3:
                System.out.println("Ainda vamos implementar :0)");
                break;

            case 4:
                System.out.println("Até breve!");
                break;
        }



        CalculadoraTaxas calculadoraTaxas = new CalculadoraTaxas();
        calculadoraTaxas.taxaTransferido(10, 20);
        calculadoraTaxas.taxaSaque();
        calculadoraTaxas.valor_conta = 1000.00;
    }
}
