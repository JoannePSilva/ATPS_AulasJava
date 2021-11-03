package Aula28.ATP31.Model;

public class Doces extends Loja {
    public String marca;

    @Override
    public String toString() {
        return super.toString() + "\n === Doces ===\n" +
                "| Marca: \n" + marca;
    }
}
