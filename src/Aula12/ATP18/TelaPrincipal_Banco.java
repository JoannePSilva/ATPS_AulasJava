package Aula12.ATP18;

public class TelaPrincipal_Banco {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();

        cc.setAgencia(1232);
        int ag = cc.getAgencia();

        cc.setNum_conta(123232987);
        long cc1 = cc.getNum_conta();

        cc.setCodigo_cliente("CDE987");
        String cod_cliente = cc.getCodigo_cliente();

        cc.setSaldo(12.345);
        double saldo = cc.getSaldo();
    }
}
