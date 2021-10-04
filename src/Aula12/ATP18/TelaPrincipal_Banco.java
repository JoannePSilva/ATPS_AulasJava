package Aula12.ATP18;

public class TelaPrincipal_Banco {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();

        cc.setAgencia(1232);
        int ag = cc.getAgencia();

        cc.setNum_conta("123232987");
        String cc1 = cc.getNum_conta();

        cc.setSaldo(12.345);
        double saldo = cc.getSaldo();


        cc.setCodigo_cliente("CDE987");
        String cod_cliente = cc.getCodigo_cliente();


        System.out.println("==========EXTRATO=============");
        System.out.printf(" Agência: %d | Conta: %s \n Saldo: %.3f \n Código do Cliente: %s", ag, cc1, saldo, cod_cliente);

    }
}
