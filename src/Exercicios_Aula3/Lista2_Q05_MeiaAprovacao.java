package Exercicios_Aula3;

import java.util.Scanner;

public class Lista2_Q05_MeiaAprovacao {
    //Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
    //A mensagem "Aprovado com Distinção", se a média for igual a dez.
    //A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
    //A mensagem "Reprovado", se a média for menor do que sete;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.print("Informe a segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1+nota2)/2;

        if(media == 10) {
            System.out.println("O aluno está aprovado com distinção!");
        } else if (media >= 7) {
            System.out.println("O aluno está aprovado!");
        } else{
            System.out.println("O aluno está reprovado!");
        }
        scan.close();
    }
}
