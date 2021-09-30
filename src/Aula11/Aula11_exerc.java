package Aula11;

import java.util.Random;

public class Aula11_exerc {
    public static void main(String[] args) {
        Random num_aleatorio = new Random();
        Calculadora calculadora = new Calculadora();


        double som = calculadora.somar(12,10);
        double sub = calculadora.subtrair(12,10);
        double multi = calculadora.multiplicar(12,10);
        double div = calculadora.dividir(12,10);
    }
}
