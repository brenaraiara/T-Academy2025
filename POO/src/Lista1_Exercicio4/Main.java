package Lista1_Exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DiarioSecreto diario = new DiarioSecreto("Brena", "0412");

        int opcao;
        do {
            System.out.println("Diário 'não tão secreto' da Brena");
            System.out.println("1 – Escrever no diário");
            System.out.println("2 – Ler o diário");
            System.out.println("3 – Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(sc.nextLine());
            System.out.println();

            switch (opcao) {
                case 1 -> diario.escrever(sc);
                case 2 -> diario.ler(sc);
                case 3 -> System.out.println("Saindo do diário... Até logo!");
                default -> System.out.println("Opção inválida! Tente novamente.\n");
            }
        } while (opcao != 3);

        sc.close();
    }
}
