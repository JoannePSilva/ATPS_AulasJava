package Aula4;

public class Aula4_Swicht {
    public static void main(String[] args) {
        int idade = 5;
        switch (idade){
            case 1:
                System.out.println("Valor 1");
                break;
            case 5:
                System.out.println("Valor 5");
                break;
            case 10:
                System.out.println("Valor 10");
                break;
            default:
                System.out.printf("Valor %d", idade);
                break;



        }
    }
}
