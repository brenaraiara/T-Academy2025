package Lista1_Exercicio3;

import java.util.ArrayList;
import java.util.List;

public class PlaylistMusical {
    public String nome;
    public List<String> musicas;
    public String musicaAtual;
    public int indiceAtual;

    public PlaylistMusical(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
        this.musicaAtual = null;
        this.indiceAtual = -1;
    }

    public void adicionarMusica(String musica) {
        musicas.add(musica);
        System.out.println("Música adicionada: " + musica);
    }

    public void tocarProxima() {
        if (musicas.isEmpty()) {
            System.out.println("A playlist está vazia.");
            return;
        }
        if (indiceAtual < musicas.size() - 1) {
            indiceAtual++;
            musicaAtual = musicas.get(indiceAtual);
            mostrarMusicaAtual();
            mostrarProximaMusica();
        } else {
            System.out.println("Final da playlist.");
        }
        System.out.println("--------------------------------------------");
    }

    public void mostrarMusicaAtual() {
        if (musicaAtual == null) {
            System.out.println("Nenhuma música está tocando no momento.");
        } else {
            System.out.println("Música atual: " + musicaAtual);
        }
    }

    public void mostrarProximaMusica() {
        if (indiceAtual < musicas.size() - 1) {
            System.out.println("Próxima: " + musicas.get(indiceAtual + 1));
        } else {
            System.out.println("Não há próxima música.");
        }
    }
}