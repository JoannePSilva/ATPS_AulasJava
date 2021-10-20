package Aula24.ATP27.View;

import Aula24.ATP27.Controller.FilmeController;
import Aula24.ATP27.Controller.SeriesController;
import Aula24.ATP27.Model.Filme;
import Aula24.ATP27.Model.Serie;

public class Main {
    public static void main(String[] args) {
        FilmeController filmeController = new FilmeController();
        SeriesController seriesController = new SeriesController();

        Filme filme = new Filme();
        filme.id_filme = 123456;
        filme.titulo = "Senhor dos Anéis";
        filme.descricao = "Filme longo pra caramba";
        filme.classificacao = 10;
        filme.ano = 2001;
        filme.duracao = 3;
        filme.lancamento ="Novembro";

        Serie serie = new Serie();
        serie.id_serie = 34567;
        serie.titulo = "How I met your mother";
        serie.descricao = "Série engraçada";
        serie.classificacao = 12;
        serie.ano = 2005;
        serie.temporada = 9;
        serie.frequencia = "Semanal";

        filmeController.create(filme);
        seriesController.create(serie);





    }
}
