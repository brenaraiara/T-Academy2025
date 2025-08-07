package Exercicios_Aula2;

import java.util.Scanner;

public class Lista1_Q12_ClassificacaoMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a nota1: ");
        double nota1 = scan.nextDouble();

        System.out.print("Informe a nota2: ");
        double nota2 = scan.nextDouble();

        System.out.print("Informe a nota3: ");
        double nota3 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média das notas é: " + media);

        if (media >= 8.5) {
            System.out.println("Aluno de Classe A");
        } else if (media >= 7.0) {
            System.out.println("Aluno de Classe B");
        } else if (media >= 5.0) {
            System.out.println("Aluno de Classe C");
        } else {
            System.out.println("Aluno de Classe D");
        }
        scan.close();

    }
}
