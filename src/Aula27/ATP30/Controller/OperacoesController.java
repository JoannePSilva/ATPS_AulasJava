package Aula27.ATP30.Controller;

import Aula27.ATP30.Model.Operacoes;
import java.util.Scanner;

public class OperacoesController {
    Operacoes op = new Operacoes();

    public void escolha_menu() {
        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o número da operação que deseja realizar:\n 1 - Adição\n 2 - Subtração\n 3 - Multiplicação\n 4 - Divisão\n 0 - Sair");
            int nume_digitado = Integer.parseInt(scanner.nextLine());

            int num = le_numeros();
            int num1 = le_numeros();

            switch (nume_digitado) {
                case 1:
                    int resultado = op.soma(num, num1);
                    System.out.printf("Você escolheu adição\n O resultado da soma é: %d", resultado);
                    break;
                case 2:
                    int resultado_sub = op.subtracao(num, num1);
                    System.out.printf("Você escolheu subtração\n O resultado da subtração: %d", resultado_sub);
                    break;
                case 3:
                    int resultado_mult = op.multiplicacao(num, num1);
                    System.out.printf("Você escolheu multiplicação\n O resultado da multiplicação é: %d", resultado_mult);
                    break;
                case 4:
                    int resultado_div = op.divisao(num, num1);
                    System.out.printf("Você escolheu divisão\n O resultado da divisão é: %d", resultado_div);
                    break;

            }
        }catch (NumberFormatException nfe){
            System.out.println("Você digitou um número inválido\n Atualize a página");

        }catch (ArithmeticException ae){
            System.out.println("Não é possível fazer divisão por zero\n Atualize a página");
        }catch (Exception ex){
            System.out.println("Ocorreu um erro inesperado\n Atualize a página");
        }
    }
    public int le_numeros(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite os números que você deseja calcular");
            int numeros = Integer.parseInt(scanner.nextLine());
            return numeros;
        }

    }
