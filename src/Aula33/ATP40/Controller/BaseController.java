package Aula33.ATP40.Controller;

import Aula33.ATP40.Model.Empresas;

import java.util.ArrayList;

public class BaseController<T> {
    ArrayList listaEmpresas;

    public BaseController() {
        this.listaEmpresas = new ArrayList();
    }

    //crud

    public void create(T e) {
        this.listaEmpresas = listaEmpresas;
    }

    public ArrayList<Empresas> read(T e) {
        return this.listaEmpresas;

    }

    public boolean contains(T e) {
        return this.listaEmpresas.contains(e);

    }

    public void delete(T e) {
        this.listaEmpresas.remove(e);
    }

    public void update(T e) {
        if (contains(e)) {
            this.delete(e);
            this.create(e);

        }
    }
}


