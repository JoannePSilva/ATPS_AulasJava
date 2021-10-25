package Aula25.ATP28.Model;

public class PessoaJuridica extends Pessoa{
    public String cnpj;

    @Override
    public String toString() {
        return super.toString() +
                "| Cnpj: " + cnpj;
    }
}
