package Aula7;

import java.util.Scanner;

public class Aula7_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean invalido = true;
        while (invalido) {
            System.out.println("====CADASTRO=====");
            System.out.println("Digite o nome");
            String nome = scanner.nextLine();
            if (nome.length() < 5) {
                System.out.println("o nome deve ter mais de 5 caracteres");
                System.out.println("Digite novamente");
            }
            System.out.println("Digite o sobrenome");
            String sobrenome = scanner.nextLine();
            if (sobrenome.length() < 5) {
                System.out.println("o nome deve ter mais de 5 caracteres");
                System.out.println("Digite novamente");
            } else {
                invalido = false;

            }
            int cont = 0;
            while (cont <= 10) {
                System.out.printf(cont + " - Nome completo: %s %s", nome, sobrenome + "\n");
                cont++;



            }

        }
    }
}