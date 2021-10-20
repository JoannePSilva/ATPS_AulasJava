package Aula24.ATP27.Model;

public class Serie extends Streaming{
    public long id_serie;
    public byte temporada;
    public String frequencia;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Serie)) return false;

        Serie serie = (Serie) o;

        return id_serie == serie.id_serie;
    }


    @Override
    public String toString() {
        return super.toString() +
                "Id_serie: " + id_serie +
                "| Temporada: " + temporada +
                "| Frequência: " + frequencia;
    }
}
