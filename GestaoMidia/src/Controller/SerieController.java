package Controller;

import Model.Filme;
import Model.Serie;

import java.util.ArrayList;
import java.util.List;

public class SerieController implements Cadastro <Serie> {
    private List<Serie> series = new ArrayList<>();

    @Override
    public void adicionar(Serie serie) {
        series.add(serie);
    }

    @Override
    public void remover(Serie serie) {
        series.remove(serie);
    }

    @Override
    public void listar() {
        System.out.println("Lista de Series: ");
        for (Serie serie : series){
            System.out.println(serie.getId() +" - "+serie.getNome()+", possui "+serie.getTemporada()+" temporadas");
        }
    }
    public Serie buscarPorId(int id){
        for (Serie serie : series){
            if (serie.getId()==id){
                return serie;
            }
        }
        return null;
    }

    public List<Serie> buscaPorTemporada(int temporada){
        List<Serie> resultado = new ArrayList<>();
        for (Serie serie:series){
            if (serie.getAno()==temporada){
                resultado.add(serie);
            }
        }
        return resultado;
    }
}
