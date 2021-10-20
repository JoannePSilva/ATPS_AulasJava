package Aula24.ATP27.Controller;

import java.util.ArrayList;

public class BaseController<T> {
    ArrayList<T> stream;

    public BaseController() {
        this.stream = new ArrayList<T>();
    }
    //crud - create, read, update, delete

    public void create(T s){
        this.stream.add(s);
    }
    public ArrayList<T> read(T s){
        return this.stream;

    }
    public void update(T s){
        if(contains(s)){
            this.delete(s);
            this.create(s);
        }
    }
    public void delete(T s){
        this.stream.remove(s);
    }
    public boolean contains(T s){
        return this.stream.contains(s);
    }
    /// numero de itens
    public int numeroItens(){
        return this.stream.size();
    }

}
