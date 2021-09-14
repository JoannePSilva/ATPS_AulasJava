package Aula4;

import java.util.Scanner;

public class Aula4_SwitchCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=========== CapFlix============");
        System.out.println("Escolha o tipo de programação que quer cadastrar  \n 1 - Série  \n 2 - Documentário  \n 3 - Filme \n 0 - Sair \n --->");
        int tipo = scanner.nextInt();

        switch (tipo) {
            case 0:
                System.out.println("__________________OBRIGADA!ATÉ BREVE____________________________");
                break;
            case 1:
                System.out.println("Você escolheu - SÉRIE - \n --> Digite o nome da série que deseja cadastrar");
                String serie = scanner.next();
                System.out.println("Digite o gênero da série");
                String genero = scanner.next();
                System.out.println("Digite o ano da série");
                Integer ano = scanner.nextInt();
                System.out.println("Digite a descrição da série");
                String descricao = scanner.nextLine();
                scanner.nextLine();
                System.out.println("__________________Cadastro realizado com sucesso!____________________________");
                System.out.printf("Série: %s | gênero: %s | Ano: %d | descrição: %s", serie, genero, ano, descricao);


                break;
            case 2:
                System.out.println("Você escolheu - DOCUMENTÁRIO - \n --> Digite o nome do documentário que deseja cadastrar");
                String Documentario = scanner.next();
                System.out.println("Digite o gênero do documentário");
                String generoDoc = scanner.next();
                System.out.println("Digite o ano do documentário");
                Integer anoDoc = scanner.nextInt();
                System.out.println("Digite a descrição do documentário");
                String descricaoDoc = scanner.next();
                System.out.println("__________________Cadastro realizado com sucesso!____________________________");

                break;
            case 3:
                System.out.println("Você escolheu - FILME - \n --> Digite o nome do filme que deseja cadastrar");
                String filme = scanner.next();
                System.out.println("Digite o gênero do filme");
                String generoFilme = scanner.next();
                System.out.println("Digite o ano do filme");
                Integer anoFilme = scanner.nextInt();
                System.out.println("Digite a descrição do filme");
                String descricaoFilme = scanner.next();
                System.out.println("__________________Cadastro realizado com sucesso!____________________________");

                break;
            default:
                System.out.println("Opção inválida");
                break;

        }
    }
}






