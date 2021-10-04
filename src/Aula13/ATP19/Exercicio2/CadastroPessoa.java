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

        PessoaFisica ps2 = new PessoaFisica();
        ps2.setNome("Julianne");
        String nome = ps2.getNome();
        ps2.setSobrenome("Silva");
        String sobrenome = ps2.getSobrenome();
        ps2.setCodigo("dfg 123");
        String cod = ps2.getCodigo();
        ps2.setCpf("098.123.232");
        String cpf = ps2.getCpf();
        ps2.setRg("765.456.543");
        String rg = ps2.getRg();

        PessoaFisica ps3 = new PessoaFisica();
        ps3.setNome("Suzanne");
        String nome = ps2.getNome();
        ps3.setSobrenome("Passos");
        String sobrenome = ps2.getSobrenome();
        ps3.setCodigo("ppf 123");
        String cod = ps2.getCodigo();
        ps3.setCpf("432.123.232");
        String cpf = ps2.getCpf();
        ps3.setRg("654.456.543");
        String rg = ps2.getRg();

        }

    }
}
