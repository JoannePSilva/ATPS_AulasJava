package Aula6;

public class IncrementandoWhile {
    public static void main(String[] args) {
        int cont = 0;
        while (cont < 5){
            System.out.println(cont);
            cont ++;
        }
        System.out.printf("o valor final: %d", cont);

        int num = 1;
        while (num <= 10){
            int mult = 0;
            while (mult <=10){
                System.out.println(num*mult);
                mult++;
            }
            num++;
        }
    }


}
