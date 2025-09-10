package Model;

public class Filme extends Midia{
    private String diretor;
    private static int contador = 0;
    private int id;

    public Filme(String nome, int ano, Genero genero, String diretor) {
        super(nome, ano, genero);
        this.diretor = diretor;
        this.id = ++contador;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public static int getContador() {
        return contador;
    }

    public int getId() {
        return id;
    }

}
