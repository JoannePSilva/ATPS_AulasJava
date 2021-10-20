package Aula20.ATP26;

public class Dados {
    int posicaoInicial;
    int tamanho = 5;
    private Object[] dados;

    public Dados() {
        this.dados = new Object[tamanho];
    }

    public String salvar(Object obj) {
        tamanho = tamanho * 2;
        String mensagem = "Salvo com sucesso";
        if (posicaoInicial < dados.length) {
            dados[posicaoInicial] = obj;
            posicaoInicial++;

        } else {
            Object[] dados1 = new Object[tamanho];
            for (int i = 0; i < dados.length; i++) {
                dados[i] = dados1[i];
            }

        }
        return mensagem;
    }
        public int size(){
            return posicaoInicial;
        }

        public boolean contains(Object c){
            for (int i = 0; i < posicaoInicial; i++) {
                if(dados[i].equals(c)){
                    return true;
                }

            }return false;
        }
    }




