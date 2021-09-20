package Aula7;

import java.util.Scanner;

public class Aula7_For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========== Cadastro ============");
        String nome = "";
        String sobrenome = "";
        int cont = 0;
        for (cont = 1; cont < 10; cont ++) {
            System.out.println("\n Digite o nome que deseja cadastrar");
            nome = scanner.next();
            System.out.println("\n Digite o sobrenome");
            sobrenome = scanner.next();

        }
        for (int i = 1; i <cont ; i++) {
            System.out.printf("%d - %s %s",i, nome, sobrenome + "\n");
        }

    }
}
