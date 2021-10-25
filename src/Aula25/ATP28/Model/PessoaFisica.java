package Aula25.ATP28.Model;

public class PessoaFisica extends Pessoa{
    public String cpf;

    @Override
    public String toString() {
        return super.toString() + "| cpf: " + cpf + "\n----------------------";
    }
}
