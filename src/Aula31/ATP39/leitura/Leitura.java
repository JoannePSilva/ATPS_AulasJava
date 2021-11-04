package Aula31.ATP39.leitura;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Leitura {
    public static void main(String[] args) {

        try{
            Scanner scanner = new Scanner(new File("src/Aula31/ATP39/dados/texto.txt"));
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException fne){
            fne.printStackTrace();
    }
    }
}
