package Lista1_Exercicio3;

public class Main {
    public static void main(String[] args) {
        PlaylistMusical minhaPlaylist = new PlaylistMusical("Mais Ouvidas");

        minhaPlaylist.adicionarMusica("Soda Pop - Saja Boys");
        minhaPlaylist.adicionarMusica("How it's Done - Huntrix");
        minhaPlaylist.adicionarMusica("Golden - Huntrix");
        minhaPlaylist.adicionarMusica("Your Idol - Saja Boys");
        minhaPlaylist.adicionarMusica("What its sounds like - Huntrix");
        System.out.println();
        System.out.println("\nPlaylist: " + minhaPlaylist.nome + "\n");

        minhaPlaylist.tocarProxima();
        minhaPlaylist.tocarProxima();
        minhaPlaylist.tocarProxima();
        minhaPlaylist.tocarProxima();
        minhaPlaylist.tocarProxima();
        minhaPlaylist.tocarProxima();
    }
}
