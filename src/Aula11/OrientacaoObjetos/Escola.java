package Aula11.OrientacaoObjetos;

public class Escola {
    public static void main(String[] args) {
        Boletim boletim = new Boletim();
        boletim.salvarMedia(1,9, 7, 8);
        boletim.salvarMedia(2,5, 7, 6);
        boletim.imprimirBoletim();

        double m3 = boletim.mediaBimestre(2);
        System.out.println("\n" + m3);

    }
}
