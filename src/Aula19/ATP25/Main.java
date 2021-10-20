package Aula19.ATP25;

public class Main {
    public static void main(String[] args) {
        Computador computador = new Computador();
        computador.marca = "Dell";
        computador.memoria_ram = "8GB";
        computador.processador = 3770;
        computador.disco_rigido = 1234;

        Notebook notebook = new Notebook();
        notebook.marca = "Intel";
        notebook.memoria_ram = "12GB";
        notebook.processador = 36700;
        notebook.bateria = 260;
        notebook.velocidade_wifi = 100;
        notebook.versao_bluetooth = "Top";
        notebook.velocidade = 987;
        notebook.disco_rigido = 2343;



        Desktop desktop = new Desktop();
        desktop.marca = "Acer";
        desktop.memoria_ram = "10GB";
        desktop.processador = 38700;
        desktop.tamanho_gabinete = 123;
        desktop.monitor = "12k";
        desktop.fonte = "ATX";
        desktop.disco_rigido = 876;





        Object obj_comp = computador;
        Object obj_note = notebook;
        Object obj_desk = desktop;

        Computador computador1 = (Computador) obj_comp;
        Desktop desktop1 = (Desktop) obj_desk;
        Notebook notebook1 = (Notebook) obj_note;

        System.out.println(computador1);
        System.out.println(desktop1);
        System.out.println(notebook1);



    }
}
