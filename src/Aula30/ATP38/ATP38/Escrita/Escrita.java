package Aula30.ATP38.ATP38.Escrita;


import java.io.*;

public class Escrita {
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("src/Aula33/ATP38/dados/escrita.txt");
            System.out.println("Aberto com sucesso");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);


            bw.write("Eita");
            bw.newLine();
            bw.write("Nóis!");

            bw.close();

            System.out.println("Arquivo aberto");

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        } catch (IOException e) {
            System.out.println("Não foi possível escrever no arquivo");
        }
    }
    }
