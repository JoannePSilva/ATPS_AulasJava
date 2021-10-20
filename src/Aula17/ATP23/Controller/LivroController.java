package Aula17.ATP23.Controller;
import Aula17.ATP23.Model.Livro;
import java.util.ArrayList;

public class LivroController {
    private ArrayList<Livro> lista_livros = new ArrayList<>();


//create read update delete

    public void create(Livro item) {
        this.lista_livros.add(item);

    }

    public ArrayList<Livro> read() {
        return this.lista_livros;
    }

    public void delete(Livro item) {
        this.lista_livros.remove(item);

    }

    public void update(Livro item) {

        for (int i = 0; i < lista_livros.size(); i++) {
            Livro bcl = this.lista_livros.get(i);

            if (bcl.getId() == item.getId()) {

            }

        }

    }
}