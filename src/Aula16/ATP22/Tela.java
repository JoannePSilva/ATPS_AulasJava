package Aula16.ATP22;

public class Tela {

        public static void main(String[] args) {

            Aluno a = new Aluno();
            Aluno a1 = new Aluno();

            System.out.println("Cadastro de alunos");
            a.setNome("Joanne");
            a.setSobrenome("Silva");
            a.setIdade(34);
            a.setMatricula("abc123");
            System.out.println(a);

            a1.setNome("Julius");
            a1.setSobrenome("Julio");
            a1.setIdade(124);
            a1.setMatricula("cde456");
            System.out.println(a1);


        }


    }
