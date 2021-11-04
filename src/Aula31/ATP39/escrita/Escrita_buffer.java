package Aula31.ATP39.escrita;

import java.io.*;

public class Escrita_buffer {
    public static void main(String[] args) {


    try{
        FileOutputStream fos = new FileOutputStream("src/Aula31/ATP39/dados/escrita.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Testando");
        bw.newLine();
        bw.write(" continue a nadar");
        bw.close();

    }catch(FileNotFoundException fnfe){
        System.out.println("Arquivo não encontrado");
    }catch(IOException ioe){
        System.out.println("Não foi possível escrever no arquivo");
    }
}
}
