package Aula17.ATP23.Model;

public class Livro {

    private int id;
    private String titulo;
    private int ano;
    private String sinopse;

    public Livro(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }


    @Override
    public boolean equals(Object o) {
        Livro outro_livro = (Livro) o;
        if (this.id == outro_livro.id) {
            return true;
        } else {
            return false;
        }
    }
}

