package Aula7;

import java.util.Scanner;

public class Aula7_Investimento {
    public static void main(String[] args) {

        double valorMensal;
        double investimento = 5.000;
        double resultado;
        double juros = 0.02;
        int periodo = 24;


        for (int i = 1; i <= periodo ; i++) {
            for (int j = 0; j < i; j++) {
                valorMensal= investimento * juros + investimento;
                resultado= valorMensal * periodo;
                System.out.println( i +"-"+ resultado);


            }



        }

    }

}
