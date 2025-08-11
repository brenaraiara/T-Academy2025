package Exercicios_Aula3;

import java.util.Scanner;

public class Lista2_Q05_MeiaAprovacao {
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
