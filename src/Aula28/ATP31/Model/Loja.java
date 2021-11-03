package Aula28.ATP31.Model;

public class Loja extends Base_id{

    public String produto;
    public int qtde;
    public double preco;

    @Override
    public String toString() {
        return "Loja: " +
                "| Produto:" + produto+
                "| Quantidade: " + qtde +
                "|Preco: \n" + preco;
    }
}
