package Exercicios_Aula1;

import java.util.Scanner;

public class Media_Notas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Existem três formas de executar esse calculo, qual deseja ver?");
            System.out.println("1 - Versão Simples (sem loop)");
            System.out.println("2 - Versão com loop (sem array)");
            System.out.println("3 - Versão com array");
            System.out.println("0 - Sair");
            System.out.println("Escolha a versão (0 a 3): ");

            escolha = scan.nextInt();
            scan.nextLine();

            switch (escolha) {
                case 1:
                    versaoSimples(scan);
                    break;
                case 2:
                    versaoComLoopSemArray(scan);
                    break;
                case 3:
                    versaoComArray(scan);
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção Inválida.");
            }
        } while (escolha != 0);
    }
        //Versão Simples
        public static void versaoSimples (Scanner scan){
            double nota1, nota2, nota3, nota4;

            System.out.println("Insira a Nota 1: ");
            nota1 = scan.nextDouble();

            System.out.println("Insira a Nota 2: ");
            nota2 = scan.nextDouble();

            System.out.println("Insira a Nota 3: ");
            nota3 = scan.nextDouble();

            System.out.println("Insira a Nota 4: ");
            nota4 = scan.nextDouble();

            double media = (nota1+nota2+nota3+nota4)/4;

            System.out.println("A média das nota é: " + media);
        }

        // Versao 2 - com loop, sem array
        public static void versaoComLoopSemArray (Scanner scan){
            double soma = 0;
            int quantidadeNotas = 4;

            for(int i = 1; i <= quantidadeNotas; i++){
                System.out.println("Insira a nota " + i + ": ");
                double nota = scan.nextDouble();
                soma+= nota;
            }
            double media = soma/quantidadeNotas;

            System.out.println("A média das notas é: " + media);
        }

       //versao 3 - com array
        public static void versaoComArray(Scanner scan){
        int quantidadeNotas = 4;
        double[] notas = new double[quantidadeNotas];
        double soma = 0;

        for (int i=0;i < quantidadeNotas; i++){
            System.out.println("Insira a nota " + (i+1) + ": ");
            notas[i] = scan.nextDouble();
            soma += notas[i];
        }
        double media = soma/quantidadeNotas;

            System.out.println("A media das notas é: " + media);
    }
}