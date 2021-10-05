package Aula14.ATP20;

public class Universidade_Main {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Coordenador coordenador = new Coordenador();
        Aluno aluno = new Aluno();

    funcionario.setNome("Gerônimo");
    funcionario.setSobrenome("Ornellas");
    funcionario.setDepartamento("História");
    funcionario.setSalario(2.565);
    funcionario.setMatricula("ABD123");


    coordenador.setNome("Ferdinando");
    coordenador.setSobrenome("O Touro");
    coordenador.setCurso_coordenado("Artes");
    coordenador.setDepartamento("Artístico");
    coordenador.setSalario(5.456);
    coordenador.setBonus("10%");

    aluno.setNome("Joanne");
    aluno.setSobrenome("Silva");
    aluno.setCurso("Artes");
    aluno.setMatricula("CDF234");
    aluno.setTurma("v237");


        System.out.printf("Funcionário: %s %s | Matéria: %s | Salário: %.4f  | Matrícula: %s", funcionario.getNome() , funcionario.getSobrenome(), funcionario.getDepartamento(), funcionario.getSalario(), funcionario.getMatricula());
        System.out.printf("\nCoordenador: %s %s | Curso: %s | Departamento: %s | Salário: %.4f  | Bônus: %s", coordenador.getNome(), coordenador.getSobrenome(), coordenador.getCurso_coordenado(), coordenador.getDepartamento(), coordenador.getSalario(), coordenador.getBonus());
        System.out.printf("\nAluno: %s %s | Curso: %s | Matrícula: %s | Turma: %s ", aluno.getNome(), aluno.getSobrenome(), aluno.getCurso(), aluno.getMatricula(), aluno.getTurma() );

    }
}
