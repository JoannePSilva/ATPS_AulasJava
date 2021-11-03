package Aula28.ATP31.Controller;

import java.util.ArrayList;

public class BaseController<T>{

    ArrayList<T> produtos;

    public BaseController() {
        this.produtos = new ArrayList<>();
    }
    //CRUD

    public void create (T p){
        this.produtos.add(p);
    }

    public ArrayList<T> read(T p){
        return this.produtos;
    }

    public void listar(ArrayList<T> produtos) {
        for (T t : produtos) {
            System.out.println(t);
        }
    }
    public boolean contains (T p){
        return this.produtos.contains(p);
    }
    public void update (T p){
        if(contains(p)){
            this.delete(p);
            this.create(p);
        }

    }

    public void delete(T p){
        this.produtos.remove(p);
    }
}
