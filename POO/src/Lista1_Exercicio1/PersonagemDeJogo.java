package Lista1_Exercicio1;

public class PersonagemDeJogo {
    public  String nome;
    public  String tipo;
    public int vida;
    public int forca;

    public PersonagemDeJogo (String nome, String tipo, int vida, int forca){
        this.nome = nome;
        this.tipo = tipo;
        this.vida = vida;
        this.forca = forca;
    }

    public  void atacar(PersonagemDeJogo inimigo){
        System.out.println(this.nome + " da classe "+this.tipo+" atacou causou dano de "+forca+" no inimigo");
        inimigo.receberDano(forca);
    }

    public void  receberDano(int dano){
        this.vida -= dano;
        if (this.vida < 0) this.vida = 0;
        System.out.println(this.nome + " recebeu " + dano + " de dano. Vida atual: " + this.vida);
    }

    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Vida: " + vida);
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public String getNome() {
        return nome;
    }
}

