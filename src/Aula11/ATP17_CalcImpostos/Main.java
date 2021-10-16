package ATP17_CalcImpostos;

public class Main {

    public static void main(String[] args) {
        CalculoImpostos calculoImpostos = new CalculoImpostos();


        calculoImpostos.cabecalho();
        double iss = calculoImpostos.calc_iss(200);
        double iof = calculoImpostos.calc_iof(150);
        double ir = calculoImpostos.calc_ir(300);

        System.out.printf("ISS %.2f |  IOF: %.2f | ISR: %.2f", iss, iof, ir);
    }


}
