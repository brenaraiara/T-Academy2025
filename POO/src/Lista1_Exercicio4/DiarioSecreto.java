package Lista1_Exercicio4;

import java.util.Scanner;

public class DiarioSecreto {
    private String dono;
    private String senha;
    private StringBuilder texto;

    public DiarioSecreto(String dono, String senha) {
        this.dono = dono;
        this.senha = senha;
        this.texto = new StringBuilder();
    }

    public void escrever(Scanner sc) {
        System.out.print("Digite a senha para escrever no diário: ");
        String senhaDigitada = sc.nextLine();

        if (this.senha.equals(senhaDigitada)) {
            System.out.print("Escreva seu relato do dia: ");
            String novoTexto = sc.nextLine();
            texto.append(novoTexto).append("\n");
            System.out.println("Texto adicionado com sucesso!\n");
        } else {
            System.out.println("Acesso negado.\n");
        }
    }

    public void ler(Scanner sc) {
        System.out.print("Digite a senha para ler o diário: ");
        String senhaDigitada = sc.nextLine();

        if (this.senha.equals(senhaDigitada)) {
            System.out.println("\nDiário 'não tão secreto' de " + dono + ":");
            System.out.println(texto.length() > 0 ? texto.toString() : "(Diário vazio)");
            System.out.println();
        } else {
            System.out.println("Acesso negado.\n");
        }
    }
}