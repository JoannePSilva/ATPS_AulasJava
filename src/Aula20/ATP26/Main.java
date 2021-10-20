package Aula20.ATP26;

public class Main {
    public static void main(String[] args) {


        Aluno aluno = new Aluno();
        aluno.nome = "Joanne";
        aluno.sobrenome = "Silva";
        aluno.curso = "Artes";
        aluno.turma = "23D";
        aluno.idade = 24;
        aluno.matricula = 1234567;


        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Fernando";
        pessoa.sobrenome = "Hernandez";
        pessoa.idade = 23;

        Dados dados = new Dados();
        System.out.println(dados.salvar(pessoa));
        System.out.println(dados.salvar(aluno));

        System.out.println(dados.size());
        System.out.println(dados.contains(aluno));

    }
}
