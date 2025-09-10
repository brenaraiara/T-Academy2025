package Model;

public class Midia {
    String nome;
    int ano;
    Genero genero;
    private static int contador = 0;
    private int id;

    public Midia(String nome, int ano, Genero genero) {
        this.nome = nome;
        this.ano = ano;
        this.genero = genero;
        this.id = ++contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public static int getContador() {
        return contador;
    }

    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return getId() + " - " + getNome();
    }

}


