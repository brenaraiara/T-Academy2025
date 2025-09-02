package Lista1_Exercicio1;

public class Main {
    public static void main(String[] args) {
        PersonagemDeJogo p1 = new PersonagemDeJogo("Atreus", "Guerreiro", 100, 20);
        PersonagemDeJogo p2 = new PersonagemDeJogo("Jaskier", "Bardo", 80, 25);

        System.out.println("Guerreiros");
        p1.exibirStatus();
        System.out.println();
        p2.exibirStatus();
        System.out.println();

        System.out.println("Combate");
        int turno = 1;
        while (p1.estaVivo() && p2.estaVivo()) {
            System.out.println("Turno " + turno + ":");

            p1.atacar(p2);
            if (!p2.estaVivo()) break;

            p2.atacar(p1);
            turno++;

            System.out.println();
        }
        System.out.println();

        System.out.println("Resultado");
        if (p1.estaVivo()) {
            System.out.println(p1.getNome() + " venceu!");
        } else {
            System.out.println(p2.getNome() + " venceu!");
        }
    }
}
