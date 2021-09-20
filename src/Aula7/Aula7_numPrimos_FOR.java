package Aula7;

import java.util.Scanner;

public class Aula7_numPrimos_FOR {
    public static void main(String[] args) {

        int num = 150;
        System.out.println("Os Números Primos até " + num + " são: ");
        for (int cont = 1; cont <= num; cont++) {
            boolean ehPrimo = true;
            for (int i = 2; i < cont; i++) {
                if (cont % i == 0) {
                    ehPrimo = false;
                }

            }
            if(ehPrimo){

                System.out.print(cont + "\n ");

            }

        }
    }
}