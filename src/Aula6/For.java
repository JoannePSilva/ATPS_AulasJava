package Aula6;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("=========== Cadastro ============");
        String nome = "";
        for (int i = 1; i < 4; i++) {
            System.out.println("\n Digite o nome que deseja cadastrar");
            nome = scanner.next();
            System.out.printf("%d - %s",i, nome);

        }

            }

        }



