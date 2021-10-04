package Aula12.ATP18;

public class TelaPrincipal_Loja {

    public static void main(String[] args) {

        Produto produto = new Produto();



        produto.setNome(" Vestido");
        String n1 = produto.getNome();

        produto.setDescricao("Preto, com listras, tam M");
        String d1 = produto.getDescricao();

        produto.setValor(89.99);
        double v1 = produto.getValor();

        produto.setCodigo("ABD123");
        String cod1 = produto.getCodigo();

        System.out.println("==========NOTA FISCAL=============");
        System.out.printf("Produto: %s\nDescrição: %s\nPreço: %.2f | Código: %s", n1, d1, v1, cod1);


    }



}
