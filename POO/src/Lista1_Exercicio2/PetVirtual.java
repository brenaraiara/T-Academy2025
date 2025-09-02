package Lista1_Exercicio2;

public class PetVirtual {
    private String nome;
    private String tipo;
    private int fome;
    private int felicidade;

    public PetVirtual(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.fome = 50;
        this.felicidade = 50;
    }

    public void alimentar() {
        fome -= 25;
        if (fome < 0) fome = 0;

        System.out.println(nome + " (" + tipo + ") acabou de comer! Sua fome agora é de: " + fome);

        if (fome < 20) {
            felicidade += 25;
            if (felicidade > 100) felicidade = 100;
            System.out.println(nome + " está feliz por estar cheio! Sua felicidade agora é: " + felicidade);
        }

        verificarHumor();
    }

    public void brincar() {
        felicidade += 25;
        if (felicidade > 100) felicidade = 100;

        System.out.println(nome + " (" + tipo + ") está brincando! Felicidade agora: " + felicidade);

        fome += 25;
        if (fome > 100) fome = 100;

        verificarHumor();
    }

    private void verificarHumor() {
        if (fome > 80) {
            felicidade -= 25;
            if (felicidade < 0) felicidade = 0;
            System.out.println(nome + " (" + tipo + ") está com muita fome e ficou triste! Felicidade agora é de: " + felicidade);
        }
    }

    public void status() {
        System.out.println("Status de " + nome + " (" + tipo + ")");
        System.out.println("Fome: " + fome);
        System.out.println("Felicidade: " + felicidade);
        System.out.println();
    }

    public String getNome() {
        return nome;
    }
}
