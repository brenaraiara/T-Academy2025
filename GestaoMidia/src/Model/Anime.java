package Model;

public class Anime extends Midia{
    private Estacao estacao;

    public Anime(String nome, int ano, Genero genero, Estacao estacao) {
        super(nome, ano, genero);
        this.estacao = estacao;
    }

    public Estacao getEstacao() {
        return estacao;
    }

    public void setEstacao(Estacao estacao) {
        this.estacao = estacao;
    }

    public enum Estacao {
        PRIMAVERA,
        OUTONO,
        INVERNO,
        VERAO;
    }
}
