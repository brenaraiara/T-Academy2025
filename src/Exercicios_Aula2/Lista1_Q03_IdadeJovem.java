package Exercicios_Aula2;

import java.util.Scanner;

public class Lista1_Q03_IdadeJovem {
    //Classifique a idade do usuario como "jovem" (menos de 30 anos) ou "não jovem" (65 anos ou mais).

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = scan.nextInt();

        if (idade < 0) {
            System.out.println("Idade Inválida");
        } else if (idade < 30) {
            System.out.println("Você é jovem!");
        } else if (idade <= 65) {
            System.out.println("Você é um adulto trabalhador!");
        } else {
            System.out.println("Você já não é tão jovem assim!");
        }
        scan.close();
    }
}
