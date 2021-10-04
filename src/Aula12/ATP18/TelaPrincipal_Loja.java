package Aula12.ATP18;

public class TelaPrincipal_Loja {

    public static void main(String[] args) {

        Produto produto = new Produto();


        produto.setNome("Vestido");
        String n1 = produto.getNome();
        System.out.println(n1);

        produto.setDescricao("Vestido preto");
        String d1 = produto.getDescricao();
        System.out.println(d1);

        produto.setValor(89.99);
        double v1 = produto.getValor();
        System.out.println(v1);

        produto.setCodigo("ABD123");
        String p1 = produto.getCodigo();
        System.out.println(p1);


    }



}
