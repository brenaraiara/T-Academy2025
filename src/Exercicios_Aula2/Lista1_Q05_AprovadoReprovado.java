package Exercicios_Aula2;

import java.util.Scanner;

public class Lista1_Q05_AprovadoReprovado {
    //Decida se um aluno foi aprovado (nota maior ou igual a 60) ou reprovado.

    public static void main(String[] args) {
        final double NOTA_MINIMA = 60.0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe sua nota: ");
        double nota = scan.nextDouble();

        if (nota < 0 || nota > 100) {
            System.out.println("Nota Inválida! Digite um valor entre 0 e 100.");
        } else if (nota >= NOTA_MINIMA) {
            System.out.println("O aluno está aprovado!");
        } else {
            System.out.println("O aluno está reprovado!");
        }
        scan.close();
    }
}
