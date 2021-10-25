package Aula27.ATP30.View;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        
        menu();
    }

    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da operação que deseja realizar:\n 1 - Adição\n 2 - Subtração\n 3 - Multiplicação\n4 - Divisão\n 0 - Sair");
        int nume_digitado = Integer.parseInt(scanner.nextLine());
        return nume_digitado;
    }
    
    
}
