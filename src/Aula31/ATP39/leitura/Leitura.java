package Aula31.ATP39.leitura;

import java.io.*;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new File("src/Aula31/ATP39/dados/texto.txt"));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException fne) {
            fne.printStackTrace();
        }

        try {
            FileOutputStream fos = new FileOutputStream("src/Aula31/ATP39/dados/leitura.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write("Escrevendo");
            bw.newLine();
            bw.write(" para testar");
            bw.close();
        }catch (FileNotFoundException fnfe){
            System.out.println("Arquivo não encontrado");
        }catch (IOException ioe){
            System.out.println("Não foi possível escrever no arquivo");
        }
    }
}