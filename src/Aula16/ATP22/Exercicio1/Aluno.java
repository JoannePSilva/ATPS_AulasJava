package Aula16.ATP22.Exercicio1;

public class Aluno {

    private String nome;
    private String sobrenome;
    private int idade;
    private String matricula;

    @Override
    public String toString() {
        return "Aluno:" + nome +' '+ sobrenome + '\n' + "Idade: " + idade + "\nMatrícula: " + matricula;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getSobrenome() {

        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {

        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }



}
