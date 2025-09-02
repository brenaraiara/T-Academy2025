package Exercicios_Aula2;

import java.util.Scanner;

public class Lista1_Q11_Aposentadoria {
    //Decida se uma pessoa pode se aposentar (idade igual ou superior a 65 anos) ou não.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a idade do trabalhador: ");
        int idade = scan.nextInt();

        if (idade >= 65) {
            System.out.println("O trabalhador pode se aposentar!");
        } else {
            System.out.println("O trabalhador não pode se aposentar ainda.");
        }
        scan.close();
    }
}
