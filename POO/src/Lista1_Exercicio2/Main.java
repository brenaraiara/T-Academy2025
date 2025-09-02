package Lista1_Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PetVirtual jupiter = new PetVirtual("Jupiter", "Gato");
        PetVirtual rocky = new PetVirtual("Rocky", "Cachorro");
        PetVirtual norberto = new PetVirtual("Norberto", "Cacatua");

        PetVirtual[] pets = {jupiter, rocky, norberto};
        int tarefa = 1;

        System.out.println("Pet Virtual");

        boolean continuar = true;
        while (continuar) {
            System.out.println("Escolha o pet:");
            for (int i = 0; i < pets.length; i++) {
                System.out.println((i + 1) + " - " + pets[i].getNome());
            }
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int escolhaPet = scanner.nextInt();

            if (escolhaPet == 0) {
                continuar = false;
                System.out.println("Saindo do jogo. Até mais!");
                break;
            }

            if (escolhaPet < 1 || escolhaPet > pets.length) {
                System.out.println("Opção inválida.");
                continue;
            }

            PetVirtual petEscolhido = pets[escolhaPet - 1];

            System.out.println("Tarefa " + tarefa + ": O que você quer fazer com " + petEscolhido.getNome() + "?");
            System.out.println("1 - Brincar");
            System.out.println("2 - Alimentar");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            int escolhaAcao = scanner.nextInt();

            switch (escolhaAcao) {
                case 1:
                    petEscolhido.brincar();
                    break;
                case 2:
                    petEscolhido.alimentar();
                    break;
                case 0:
                    continue;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            petEscolhido.status();
            tarefa++;
        }

        scanner.close();
    }
}
