package Controller;

import Model.Filme;

import java.util.ArrayList;
import java.util.List;

public class FilmeController implements Cadastro <Filme>{
    private List<Filme> filmes = new ArrayList<>();

    @Override
    public void adicionar(Filme filme) {
        filmes.add(filme);
    }

    @Override
    public void remover(Filme filme) {
        filmes.remove(filme);
    }

    @Override
    public void listar() {
        System.out.println("Lista de filmes: ");
        for (Filme filme : filmes){
            System.out.println(filme.getId() +" - "+filme.getNome()+", dirigido por "+filme.getDiretor()+" em "+ filme.getAno());
        }
    }
    public Filme buscarPorId(int id){
        for (Filme filme : filmes){
            if (filme.getId()==id){
                return filme;
            }
        }
        return null;
    }
    public List<Filme> buscaPorDiretor(String diretor){
        List<Filme> resultado = new ArrayList<>();
        for (Filme filme : filmes){
            if (filme.getDiretor().equalsIgnoreCase(diretor)){
                resultado.add(filme);
            }
        }
        return resultado;
    }
    public List<Filme> buscaPorAno(int ano){
        List<Filme> resultado = new ArrayList<>();
        for (Filme filme:filmes){
            if (filme.getAno()==ano){
                resultado.add(filme);
            }
        }
        return resultado;
    }

}
