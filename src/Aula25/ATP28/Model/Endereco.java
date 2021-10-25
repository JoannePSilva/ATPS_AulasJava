package Aula25.ATP28.Model;

import Aula22.Model.Base;

public class Endereco extends Base {

    public String estado;
    public String cidade;
    public String rua;
    public String complemento;
    public int numero;

    @Override
    public String toString() {
        return "Estado: " + estado +
                "| Cidade: " + cidade+
                "| Rua: " + rua +
                "| Complemento: " + complemento +
                "| Número: " + numero;
    }
}
