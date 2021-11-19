package aula37.view;

import aula37.dao.CategoriaDao;
import aula37.model.Categoria;

public class ViewRead {
    public static void main(String[] args) {
        CategoriaDao dao = new CategoriaDao();
        for (Categoria c : dao.read()) {
            System.out.printf("%d - %s\n", c.getId(), c.getNome());
        }
    }
}
