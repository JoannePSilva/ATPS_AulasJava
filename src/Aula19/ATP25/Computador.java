package Aula19.ATP25;

public class Computador {
    public String marca;
    public String memoria_ram;
    public int processador;
    public int disco_rigido;

    @Override
    public String toString() {
        return "===Computador===\n" +
                "Marca:" + marca +
                "|Memoria_ram:" + memoria_ram +
                "|Processador: " + processador +
                "|Disco_rigido:" + disco_rigido;
    }
}
