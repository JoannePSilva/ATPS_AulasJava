package Aula27.ATP30.Model;

public class Operacoes {

    public int soma(int num1, int num2){
        int resultado = num1 + num2;
        return resultado;
    }

    public int subtracao(int num1, int num2){
        int resultado = num1 - num2;
        return resultado;
    }
    public int multiplicacao(int num1, int num2){
        int resultado = num1 * num2;
        return resultado;
    }
    public int divisao(int num1, int num2){
        int resultado = num1 / num2;
        return resultado;
    }

    public void escolha_menu(int num_digitado) {
        switch (num_digitado) {
            case 1:
                int resultado = soma(2, 3);
                System.out.printf("Você escolheu adição\n O resultado da soma é: " + resultado);
                break;
            case 2:
                int resultado_sub = subtracao(2, 3);
                System.out.printf("Você escolheu subtração\n O resultado da subtração: " + resultado_sub);
                break;
            case 3:
                int resultado_mult = multiplicacao(2, 3);
                System.out.printf("Você escolheu multiplicação\n O resultado da multiplicação é: " + resultado_mult);
                break;
            case 4:
                int resultado_div = divisao(2, 3);
                System.out.printf("Você escolheu divisão\n O resultado da divisão é: " + resultado_div);
                break;

        }
    }

}
