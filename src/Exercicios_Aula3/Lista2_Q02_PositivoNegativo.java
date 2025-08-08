package Exercicios_Aula3;

import java.util.Scanner;

public class Lista2_Q02_PositivoNegativo {
    // Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Escolha um número: ");
        int numero = scan.nextInt();

        if (numero < 0) {
            System.out.println("O número informado é negativo.");
        } else if (numero > 0) {
            System.out.println("O número informado é positivo");
        } else {
            System.out.println("O número informado é zero, um número neutro.");
        }
        scan.close();
    }
}
