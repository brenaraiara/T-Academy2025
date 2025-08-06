package Exercicios_Aula2;

import java.util.Scanner;

public class Medio11_Aposentadoria {
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
