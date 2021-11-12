package Aula33.ATP40.Model;

public class Empresas extends BaseId{
    public String nome;
    public int cnpj;
    public String ramo;

    @Override
    public String toString() {
        return "=====Empresas====" +
                "Id:" + id +
                "Nome='" + nome +
                "Cnpj=" + cnpj +
                "Ramo='" + ramo;
    }
}
