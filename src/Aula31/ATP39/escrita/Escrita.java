//package Aula31.ATP39.escrita;
//
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class Escrita {
//    public static void main(String[] args) {
//
//        FileWriter fw = null;
//        try{
//
//            fw = new FileWriter("src/Aula31/ATP39/dados/escrita.txt", true);
//            fw.write("Acho  ");
//            fw.write("que  ");
//            fw.write("consegui  ");
//            fw.close();
//        }catch (FileNotFoundException e){
//            System.out.println("Não foi possível encontrar o arquivo");
//        }catch (IOException ioe){
//            System.out.println("Não foi possível escrever no arquivo");
//        }
//    }
//
//}
