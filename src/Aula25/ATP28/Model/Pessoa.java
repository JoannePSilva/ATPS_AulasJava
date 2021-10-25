package Aula25.ATP28.Model;

public abstract class Pessoa extends Base{

    public String nome;
    public String sobrenome;
    public Endereco enderecoResidencial;
    public Endereco enderecoComercial;

    public Pessoa() {
        this.enderecoResidencial = new Endereco();
        this.enderecoComercial = new Endereco();
    }

    @Override
    public String toString() {
        return super.toString() +"\n" +"Nome Completo: " + nome +" "+sobrenome +
                "\nEndereço Residencial: " + enderecoResidencial +
                "\nEndereço Comercial: " + enderecoComercial;
    }
}
