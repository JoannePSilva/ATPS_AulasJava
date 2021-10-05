package Aula13.ATP19.Exercicio2;

public class CadastroPessoa {

    public static void main(String[] args) {
        PessoaFisica pessoa = new PessoaFisica();
        PessoaFisica [] pessoas = new PessoaFisica[3];

        PessoaFisica ps1 = new PessoaFisica();
        ps1.setNome("Joanne");
        ps1.setSobrenome("Silva");
        ps1.setCodigo("cbd 123");
        ps1.setCpf("213.123.232");
        ps1.setRg("456.456.543");
        pessoas [0] = ps1;

        PessoaFisica ps2 = new PessoaFisica();
        ps2.setNome("Julianne");
        ps2.setSobrenome("Silva");
        ps2.setCodigo("dfg 123");
        ps2.setCpf("098.123.232");
        ps2.setRg("765.456.543");
        pessoas [1] = ps2;

        PessoaFisica ps3 = new PessoaFisica();
        ps3.setNome("Suzanne");
        ps3.setSobrenome("Passos");
        ps3.setCodigo("ppf 123");
        ps3.setCpf("432.123.232");
        ps3.setRg("654.456.543");
        pessoas [2] = ps3;

        for (PessoaFisica pf: pessoas) {
            System.out.println(pf);

        }
        }

    }
