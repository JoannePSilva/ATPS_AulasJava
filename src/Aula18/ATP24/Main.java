package Aula18.ATP24;

public class Main {
    public static void main(String[] args) {


        Veiculo veiculo = new Veiculo();
        veiculo.marca = "Onix";
        veiculo.modelo = "Chevorlet";
        veiculo.placa = "ABD2423";


        Carro carro = new Carro();
        carro.marca ="Ford";
        carro.modelo = "Sedan";
        carro.placa = "CDF234";
        carro.n_portas = 4;
        carro.capacidade_pm = 25.98;


        Object objcarro = carro;
        Object objveiculo = veiculo;

        Veiculo veiculo1 = (Veiculo) objveiculo;
        Carro carro1 = (Carro) objcarro;

        imprime(veiculo1);
        imprime(carro1);
    }
    public static void imprime(Object obj){
        System.out.println(obj);
    }
}
