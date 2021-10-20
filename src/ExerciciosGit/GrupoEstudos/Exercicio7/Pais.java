package ExerciciosGit.GrupoEstudos.Exercicio7;

public class Pais extends Continente{

    private String nome_pais;
    private int populacao_pais;
    private long dimensao_pais;


    public Pais(String nome, long dimensao, String nome_pais, int populacao_pais, long dimensao_pais) {
        super(nome, dimensao);
        this.nome_pais = nome_pais;
        this.populacao_pais = populacao_pais;
        this.dimensao_pais = dimensao_pais;
    }

    public void paises(String nome_pais){
        String pais_adicionado = nome_pais;
    }


}
