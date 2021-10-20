package Aula19.ATP25;

public class Notebook extends Computador{
    public int bateria;
    public int velocidade;
    public int velocidade_wifi;
    public String versao_bluetooth;

    @Override
    public String toString() {
        return "===Notebook===\n" +
                "Marca:" + marca +
                "| Memoria_ram: " + memoria_ram +
                "| Processador: " + processador +
                "| Disco_rigido: " + disco_rigido +
                "| Bateria: " + bateria +
                "| Velocidade: " + velocidade +
                "| Velocidade_wifi: " + velocidade_wifi +
                "| Versao_bluetooth: " + versao_bluetooth ;
    }
}
