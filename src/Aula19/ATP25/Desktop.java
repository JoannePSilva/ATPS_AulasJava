package Aula19.ATP25;

public class Desktop extends Computador{
    public int tamanho_gabinete;
    public String monitor;
    public String fonte;

    @Override
    public String toString() {
        return "=== Desktop ===\n" +
                "Marca: " + marca +
                "| Memoria_ram: " + memoria_ram +
                "| Processador: " + processador +
                "| Disco_rigido: " + disco_rigido +
                "| Tamanho_gabinete: " + tamanho_gabinete +
                "| Monitor: " + monitor +
                "| Fonte: " + fonte;
    }
}
