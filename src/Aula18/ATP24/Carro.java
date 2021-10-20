package Aula18.ATP24;

public class Carro extends Veiculo{
    public int n_portas;
    public double capacidade_pm;

    @Override
    public String toString() {
        return "- - -Carro- - -\n" +
                "Marca: " + marca +
                "| Modelo: " + modelo +
                "| Placa: " + placa +
                "| Capacidade do porta-malas:" + capacidade_pm +
                "| Número de portas:" + n_portas;
    }
}
