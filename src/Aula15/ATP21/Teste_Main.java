package Aula15.ATP21;

import java.util.Random;

public class Teste_Main {
    public static void main(String[] args) {
        Random random = new Random();
        Conta conta = new Conta();
        ContaCorrente cc = new ContaCorrente();

        conta.setClient_code("ABC123");
        conta.setBalance(1005.23);
        System.out.printf("\n = = = = = = CONTA = = = = = =\nCódigo do cliente: %s | Saldo: %.2f  ", conta.getClient_code(), conta.getBalance());
        double transferencia1 = 150;
        conta.transfer(transferencia1);
        System.out.printf("\nTransferência: %.2f | Saldo atualizado: %.2f \n", transferencia1, conta.getBalance());

        cc.setClient_code("DEF456");
        cc.setBalance(1621.23);
        System.out.printf("\n+ + + + + CONTA CORRENTE + + + + +\nCódigo do cliente: %s | Saldo: %.2f  ", cc.getClient_code(), cc.getBalance());
        double transferencia2 = 30;
        cc.transfer(transferencia2);
        System.out.printf("\nTransferência: %.2f | Saldo atualizado: %.2f\n", transferencia2, conta.getBalance());


        double transferencias;
        for (int i = 0; i <=10; i++) {
            cc.transfer(transferencias = random.nextDouble()*200);
            System.out.println("--------------------------------------------");
            System.out.printf("\n Operação nº %d: transferência de %.2f", i, transferencias);
            System.out.printf("\nSaldo: %.2f \n", cc.getBalance());
        }

    }

}
