package Aula28.ATP31.View;

import Aula28.ATP31.Controller.DocesController;
import Aula28.ATP31.Controller.FantasiasController;
import Aula28.ATP31.Model.Doces;
import Aula28.ATP31.Model.Fantasias;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DocesController dc = new DocesController();
        FantasiasController fc = new FantasiasController();
        Fantasias fantasias = new Fantasias();
        Doces doces = new Doces();
        Scanner sc = new Scanner(System.in);

        boolean invalido = true;
        do {
            System.out.println("=============================CADASTRO DE PRODUTOS Zé do caixão ===================================");
            System.out.println("Escolha uma opção: \n 1-Cadastrar \n 2-Listar \n 3-Atualizar \n 4-Deletar \n 5-Sair");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrando o produto: ");
                    dc.create(adicionar());
                    System.out.println("Deseja continuar o cadastro --> S | N ?");
                    break;

                case 2:
                    System.out.println("-------------Lista Cadastrada-----------------");
                    dc.listar(dc.read(doces));
                    System.out.println(doces);
                    System.out.println("Deseja continuar o cadastro --> S | N ?");
                    break;

                case 3:
                    dc.update(adicionar());
                    System.out.println("\n------------Atualizada com sucesso!----------------");
                    System.out.println("Deseja voltar ao menu --> S | N ?");
                    break;

                case 4:
                    dc.delete(doces);
                    System.out.println("-----Deletado com sucesso---------");
                    System.out.println("Deseja voltar ao menu --> S | N ?");
                    break;

                case 5:
                    System.out.println("Saindo");
                    break;
            }
        } while (!invalido);
    }
            public static Doces adicionar(){
            Doces doces1 = new Doces();
            Scanner sc = new Scanner(System.in);

            System.out.print("- Digite a marca produto: ");
            doces1.marca = sc.nextLine();

            System.out.print("- Digite a quantidade do produto: ");
             doces1.qtde = Integer.parseInt(sc.nextLine());

            System.out.print("- Digite o nome do produto: ");
            doces1.produto = sc.nextLine();

            System.out.print("- Digite o preço do produto: ");
            doces1.preco = Double.parseDouble(sc.nextLine());
            System.out.printf("\nO produto %s - %s foi cadastrado com sucesso!\n Dados cadastrados: %d | %s | %f \n", doces1.marca, doces1.qtde, doces1.produto, doces1.preco);

            return doces1;
        }



        }

