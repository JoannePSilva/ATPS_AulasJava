package Aula31.ATP39.leitura;

import java.io.*;

public class Leitura2 {
    public static void main(String[] args) {
        FileReader fr = null;

        try {

            InputStream is = System.in;
            Reader r = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(r);
            br.read();
            br.close();

        } catch (
                FileNotFoundException fnfe) {
            System.out.println("Arquivo não encontrado");
        } catch (
                IOException ioe) {
            System.out.println("Não foi possível ler o arquivo");
        }
    }
}