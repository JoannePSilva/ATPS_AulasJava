package ATP17_CalcImpostos;


public class CalculoImpostos {


    private double iss = 0.02;
    private double iof = 0.0038;
    private double ir = 0.075;

    public void cabecalho(){
        System.out.println("====== C A L C U L A D O R A ====== \n   = = = = = de = = = = =   \n ====== I M P O S T O S ======");
    }

    public double calc_iss(double valor_iss){
        double calcIss = iss * valor_iss;
        return calcIss;

    }
    public double calc_iof(double valor_iof){
        double calcIof = iof * valor_iof;
        return calcIof;

    }
    public double calc_ir(double valor_isr){
        double calcIr = ir * valor_isr;
        return calcIr;

    }


}
