package Aula25.ATP28.View;

import Aula25.ATP28.Controller.PessoaFisicaController;
import Aula25.ATP28.Controller.PessoaJuridicaController;
import Aula25.ATP28.Model.PessoaFisica;
import Aula25.ATP28.Model.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        PessoaFisicaController pfc = new PessoaFisicaController();
        PessoaJuridicaController pjc = new PessoaJuridicaController();

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.id = "ab12";
        pessoaFisica.nome = "Marvin";
        pessoaFisica.sobrenome = "Aepv";
        pessoaFisica.cpf = "123456778";
        pessoaFisica.enderecoComercial.cidade = "Porto Alegre";
        pessoaFisica.enderecoComercial.estado = "RS";
        pessoaFisica.enderecoComercial.rua = "Laranjeiras";
        pessoaFisica.enderecoComercial.numero = 12;
        pessoaFisica.enderecoComercial.complemento = "Apartamento";
        pessoaFisica.enderecoResidencial.cidade = "Canoas";
        pessoaFisica.enderecoResidencial.estado = "RS";
        pessoaFisica.enderecoResidencial.rua = "Orquídeas";
        pessoaFisica.enderecoResidencial.numero = 20;
        pessoaFisica.enderecoResidencial.complemento = "Casa 10";

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.id = "cd34";
        pessoaJuridica.nome = "Geléca";
        pessoaJuridica.sobrenome = "Aepv";
        pessoaJuridica.cnpj = "876543";
        pessoaJuridica.enderecoComercial.cidade = "São Borja";
        pessoaJuridica.enderecoComercial.estado = "RS";
        pessoaJuridica.enderecoComercial.rua = "Ijuí";
        pessoaJuridica.enderecoComercial.numero = 19;
        pessoaJuridica.enderecoComercial.complemento = "Colina";
        pessoaJuridica.enderecoResidencial.cidade = "Florianópolis";
        pessoaJuridica.enderecoResidencial.estado = "SC";
        pessoaJuridica.enderecoResidencial.rua = "Bananeiras";
        pessoaJuridica.enderecoResidencial.numero = 2;
        pessoaJuridica.enderecoResidencial.complemento = "Beira Mar";

        System.out.println(pessoaFisica);
        System.out.println(pessoaJuridica);

        pfc.contains(pessoaFisica);
        pfc.delete(pessoaFisica);
        pfc.create(pessoaFisica);


    }
}
