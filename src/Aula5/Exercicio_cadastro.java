package Aula5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_cadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // ArrayList<Cliente> cadastro = new ArrayList<>();


        System.out.println("=========== CADASTRO CAPCLIENT  ============");
        System.out.println("Escolha a opção a seguir  \n 1 - Cadastrar cliente  \n 2 - Listar clientes  \n 0 - Sair \n --->");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 0:
                System.out.println("__________________OBRIGADA!ATÉ BREVE____________________________");
                break;
            case 1:
                String nome= "";
                boolean invalido = true;
                do {
                    System.out.println("--> Digite o primeiro nome do cliente");
                    nome = scanner.next();
                    if (nome.length() < 3) {
                        System.out.println("o nome deve ter mais do que 3 caracteres");
                        System.out.println("Digite novamente");

                    } else {
                        invalido = false;
                    }
                }while (invalido) ;

                    invalido = true;
                    String sobrenome= "";
                    do {
                        System.out.println("Digite o sobrenome");
                        sobrenome = scanner.next();
                        if (sobrenome.length() < 3) {
                            System.out.println("o nome deve ter mais do que 3 caracteres");
                            System.out.println("Digite novamente");
                        } else {
                            invalido = false;

                        }

                    }while (invalido) ;


                        invalido = true;
                        String rg= "";
                        do {
                            System.out.println("Digite o RG do cliente");
                            rg = scanner.next();
                            if (rg.length() < 4 || rg.length() > 11) {
                                System.out.println("o RG deve ter mais do que 4 e menos que 11 caracteres ");
                                System.out.println("Digite novamente");
                            } else {
                                invalido = false;
                            }

                        }while (invalido);

                            invalido = true;
                            String cpf= "";
                            do {
                                System.out.println("Digite o CPF do cliente");
                                cpf = scanner.next();
                                if (cpf.length() < 4 || cpf.length() > 11) {
                                    System.out.println("o RG deve ter mais do que 4 e menos que 11 caracteres ");
                                    System.out.println("Digite novamente");
                                } else {
                                    invalido = false;
                                }

                            }while (invalido) ;

                                System.out.println("__________________Cadastro realizado com sucesso!____________________________");
                                 System.out.printf("Nome completo: %s %s | RG: %s | CPF: %s", nome, sobrenome, rg, cpf);
                                 break;

                                case 2:
                                    System.out.println("Você escolheu a opção listar");

                                    break;

                                default:
                                    System.out.println("Opção inválida, volte ao menu");
                                    break;
                            }

                        }
                    }
