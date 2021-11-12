package Aula32.P2;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Carros c1 = new Carros();
        c1.marca = "VW";
        c1.modelo = "Fusca";

        try{
            FileWriter fw = new FileWriter("src/Aula32/P2/Carros.csv", true);
            String carroString = String.format("%s;%s" , "\n", c1.marca+";"+ c1.modelo);
            fw.write(carroString);
            fw.close();
        }catch(IOException ioe){
            System.out.println("Não foi ´possível abrir");

        }try {
            Scanner sc = new Scanner(new File("src/Aula32/P2/Carros.csv"));
            while(sc.hasNextLine()){
                String linha = sc.nextLine();
                String[] carrosString = linha.split(";");

                Carros c = new Carros();
                c.marca = carrosString[0];
                c.modelo = carrosString[1];
            }

        }catch (FileNotFoundException fnf){
            System.out.println("Não foi possível abrir o arquivo");
        }
    }
}
