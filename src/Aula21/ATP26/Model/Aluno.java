package Aula21.ATP26.Model;

public class Aluno extends Pessoa {
    public long matricula;
    public String turma;
    public String curso;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        if (!super.equals(o)) return false;

        Aluno aluno = (Aluno) o;

        if (matricula != aluno.matricula) return false;
        if (turma != null ? !turma.equals(aluno.turma) : aluno.turma != null) return false;
        return curso != null ? curso.equals(aluno.curso) : aluno.curso == null;
    }

    @Override
    public String toString() {
        return "= = = = = = Aluno = = = = =\n"  +
                "Matrícula:" + matricula +
                "| Turma='" + turma +
                "| Curso='" + curso +
                "| Nome='" + nome +
                "| Sobrenome='" + sobrenome +
                "| Idade=" + idade;
    }
}
