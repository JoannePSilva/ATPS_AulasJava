package Aula16.ATP22.Exercicio2;

public class Tela_Banco {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1000.23, "abd223");

        cc.saque(12.09);

        cc.deposito(59.98);

        System.out.println(cc);


    }
}
