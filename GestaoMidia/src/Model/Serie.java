package Model;

public class Serie extends Midia{
    private int temporada;
    private static int contador = 0;
    private int id;

    public Serie(String nome, int ano, Genero genero, int temporada) {
        super(nome, ano, genero);
        this.temporada=temporada;
        this.id=++contador;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
    public int getId() {
        return id;
    }
    public static int getContador() {
        return contador;
    }
}
