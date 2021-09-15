package Aula5;

import java.util.Scanner;

public class Aula5_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean invalido = true;
        while (invalido) {
            System.out.println("Digite o nome do produto");
            String nome = scanner.nextLine();
            if (nome.length() < 5) {
                System.out.println("o nome deve ter mais de 5 caracteres");
                System.out.println("Digite novamente");

            } else {
                invalido = false;
            }
            while (invalido) ;
        }

    }
}
