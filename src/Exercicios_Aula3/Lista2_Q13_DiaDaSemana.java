package Exercicios_Aula3;

import java.util.Scanner;

public class Lista2_Q13_DiaDaSemana {
    // Faça um Programa que leia um número e exiba o dia correspondente da. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número (1 a 7): ");
        int dia = scan.nextInt();

        if (dia == 1) {
            System.out.println("O dia correspondente é domingo.");
        } else if (dia == 2) {
            System.out.println("O dia correspondente é segunda-feira.");
        } else if (dia == 3) {
            System.out.println("O dia correspondente é terça-feira.");
        } else if (dia == 4) {
            System.out.println("O dia correspondente é quarta-feira.");
        } else if (dia == 5) {
            System.out.println("O dia correspondente é quinta-feira.");
        } else if (dia == 6) {
            System.out.println("O dia correspondente é sexta-feira.");
        } else if (dia == 7) {
            System.out.println("O dia correspondente é sábado.");
        } else {
            System.out.println("O valor digitado é inválido!");
        }
        scan.close();
    }
}
