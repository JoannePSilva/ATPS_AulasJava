package Aula21.ATP26.Model;

public class Pessoa {
    public String nome;
    public String sobrenome;
    public int idade;

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;

        Pessoa pessoa = (Pessoa) o;

        if (idade != pessoa.idade) return false;
        if (nome != null ? !nome.equals(pessoa.nome) : pessoa.nome != null) return false;
        return sobrenome != null ? sobrenome.equals(pessoa.sobrenome) : pessoa.sobrenome == null;
    }


    @Override
    public String toString() {
        return "===== Pessoa =====" +
                "Nome='" + nome +
                "| Sobrenome='" + sobrenome +
                "| Idade=" + idade;

        }
    }

