package Aula18.ATP24;

public class Veiculo {
    public String marca;
    public String modelo;
    public String placa;

    @Override
    public String toString() {
        return "- - -Veiculo- - -\n" +
                "Marca: " + marca +
                "| Modelo: " + modelo +
                "| Placa:" + placa;
    }
}
