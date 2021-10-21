package Aula25.ATP28.Controller;

import java.util.ArrayList;

public class BasicController <T>{

    ArrayList<T> pessoas;

    public BasicController() {
        this.pessoas = new ArrayList<>();
    }
    //CRUD

    public void create (T p){
        this.pessoas.add(p);
    }

    public ArrayList<T> read(T p){
        return this.pessoas;
    }

    public boolean contains (T p){
        return this.pessoas.contains(p);
    }
    public void update (T p){
        if(contains(p)){
            this.delete(p);
            this.create(p);
        }

    }

    public void delete(T p){
        this.pessoas.remove(p);
    }
}
