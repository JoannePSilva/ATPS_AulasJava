package Aula15.ATP21;

public class Teste_Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        ContaCorrente cc = new ContaCorrente();

        conta.setClient_code("ABC123");
        conta.setBalance(1005.23);
        System.out.printf("Código do cliente: %s | Conta: %.2f  ", conta.getClient_code(), conta.getBalance());
        double transferencia1 = 150;
        conta.transfer(transferencia1);
        System.out.printf("Transferência: %.2f | Saldo: %.2f", transferencia1, conta.getBalance());

        cc.setClient_code("DEF456");
        System.out.printf("\n+++++CONTA CORRENTE\n Código do cliente: %s | Conta: %.2f  ", cc.getClient_code(), cc.getBalance());
        cc.setBalance(1621.23);
        double transferencia2 = 30;
        cc.transfer(transferencia2);
        System.out.printf("Transferência: %.2f | Saldo: %.2f", transferencia2, conta.getBalance());


        double transferencias = 100.0;

        for (int i = 0; i <=10; i++) {
            cc.transfer(transferencias);
            System.out.printf("\n Operação nº %d: uma transferência de %.2f", i, transferencias);
            System.out.printf("\nSaldo: %.2f \n", cc.getBalance());
        }

        }

}