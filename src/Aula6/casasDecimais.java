package Aula6;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class casasDecimais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========== Cadastro ============");
        System.out.println("Digite o nome do candidato");
        String nome = scanner.next();
        System.out.println("Digite o sobrenome do candidato");
        String sobrenome = scanner.next();
        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();
        int maiorIdade = 18;


        System.out.printf("Nome completo:  %s %s | idade : %d", nome, sobrenome, idade);
    }

}
