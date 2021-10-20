package Aula24.ATP27.Model;

public class Streaming {
    public String titulo;
    public int ano;
    public String descricao;
    public byte classificacao;

    @Override
    public String toString() {
        return " Título: " + titulo +
                "| Ano:" + ano +
                "| Descrição: " + descricao +
                "| Classificacao: " + classificacao;
    }
}
