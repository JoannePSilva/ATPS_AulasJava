package Aula24.ATP27.Model;

public class Filme extends Streaming{
    public long id_filme;
    public int duracao;
    public String lancamento;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Filme)) return false;

        Filme filme = (Filme) o;

        return id_filme == filme.id_filme;
    }


    @Override
    public String toString() {
        return super.toString() +
                "| Id_filme: " + id_filme +
                "| Duração: " + duracao +
                "| Lançamento: " + lancamento;
    }
}
