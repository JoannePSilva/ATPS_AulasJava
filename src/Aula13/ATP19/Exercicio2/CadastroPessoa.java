package Aula13.ATP19.Exercicio2;

public class CadastroPessoa {

    public static void main(String[] args) {
        PessoaFisica pessoa = new PessoaFisica();
        PessoaFisica [] pessoas = new PessoaFisica[5];

        PessoaFisica ps1 = new PessoaFisica();
        ps1.setNome("Joanne");
        String nome = ps1.getNome();
        ps1.setSobrenome("Silva");
        String sobrenome = ps1.getSobrenome();
        ps1.setCodigo("cbd 123");
        String cod = ps1.getCodigo();
        ps1.setCpf("213.123.232");
        String cpf = ps1.getCpf();
        ps1.setRg("456.456.543");
        String rg = ps1.getRg();


    }
}
