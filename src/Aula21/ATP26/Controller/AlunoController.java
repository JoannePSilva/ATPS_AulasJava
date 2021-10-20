package Aula21.ATP26.Controller;

import java.util.ArrayList;

public class Dados {

    private ArrayList<Object> dados;

    public Dados() {

        this.dados = new ArrayList<Object>();
    }

    public String salvar(Object obj) {
        dados.add(obj);
    }
        public int size(){

        return dados.size();
        }

        public boolean contains(Object c){
           return this.dados.contains(c);
            }
        }




