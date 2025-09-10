package Controller;

import Model.Anime;

import java.util.ArrayList;
import java.util.List;

public class AnimeController implements Cadastro<Anime> {
    private List<Anime> animes = new ArrayList<>();

    @Override
    public void adicionar(Anime anime) {
        animes.add(anime);
    }

    @Override
    public void remover(Anime anime) {
        animes.remove(anime);
    }

    @Override
    public void listar() {
        System.out.println("Lista de animes: ");
        for (Anime anime : animes){
            System.out.println(anime.getId() +" - "+anime.getNome()+", sendo exibido durante o/a "+anime.getEstacao()+" de "+ anime.getAno());
        }
    }
    public Anime buscarPorId(int id){
        for (Anime anime : animes){
            if (anime.getId()==id){
                return anime;
            }
        }
        return null;
    }
    public List<Anime> buscaPorEstacao(Anime.Estacao estacao){
        List<Anime> resultado = new ArrayList<>();
        for (Anime anime : animes){
            if (anime.getEstacao()==estacao){
                resultado.add(anime);
            }
        }
        return resultado;
    }
    public List<Anime> buscaPorAno(int ano){
        List<Anime> resultado = new ArrayList<>();
        for (Anime anime:animes){
            if (anime.getAno()==ano){
                resultado.add(anime);
            }
        }
        return resultado;
    }
}
