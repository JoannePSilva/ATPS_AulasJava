package Aula27.ATP30.Controller;

import Aula27.ATP30.Model.Numeros;

import java.util.Scanner;

public class OperacoesController {


    public int soma(Numeros numb){
        int resultado = numb.num1 + numb.num2;
        return resultado;
    }

    public int subtracao(Numeros numb){
        int resultado = numb.num1 - numb.num2;
        return resultado;
    }
    public int multiplicacao(Numeros numb){
        int resultado = numb.num1 * numb.num2;
        return resultado;
    }
    public int divisao(Numeros numb){
        int resultado = numb.num1 / numb.num2;
        return resultado;
    }

        }


