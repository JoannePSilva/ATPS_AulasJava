import java.util.Scanner;

public class Aula4_if_else {

        public static void main(String[] args) {
            boolean verdade = true;

            Scanner scanner = new Scanner(System.in);

            System.out.println("=========== Cadastro ============");
            System.out.println("Digite o nome do candidato");
            String nome = scanner.next();
            System.out.println("Digite o sobrenome do candidato");
            String sobrenome = scanner.next();
            System.out.println("Digite a idade: ");
            int idade = scanner.nextInt();
            int maiorIdade = 18;


            if(idade < maiorIdade) {
                System.out.println("menor de idade, peça ajuda de um adulto para se cadastrar");
            }else {
                System.out.println("Cadastro realizado com sucesso");
                System.out.printf("\n Nome:  %s, \n sobrenome: %s \n idade: %d\n",nome, sobrenome, idade);
            }




        }
    }
