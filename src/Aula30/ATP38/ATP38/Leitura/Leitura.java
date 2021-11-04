package Aula30.ATP38.ATP38.Leitura;

import java.io.*;

public class Leitura {
    public static void main(String[] args) {


        try {
            FileInputStream fis = new FileInputStream("src/Aula30/ATP38/dados/texto.txt");
            System.out.println("Aberto com sucesso");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            while (br.ready()) {
                String le_linha = br.readLine();
                System.out.println(le_linha);
            }
            br.close();

            System.out.println("Arquivo aberto");

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        } catch (IOException e) {
            System.out.println("Não foi possível abrir o arquivo");
        }
    }
}