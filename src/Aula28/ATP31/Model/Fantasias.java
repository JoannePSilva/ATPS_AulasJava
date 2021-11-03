package Aula28.ATP31.Model;

public class Fantasias extends Loja {
    public String hallowen;
    public String unicornios;
    public String herois;

    @Override
    public String toString() {
        return super.toString() + " === Fantasias=== " +
                "Hallowen: " + hallowen +
                "| Unicórnios: " + unicornios +
                "| Herois: " + herois;
    }
}
