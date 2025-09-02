package Exercicios_Aula1;

import java.util.Scanner;

public class ValorFinal_Desconto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome do produto: ");
        String nome = scan.nextLine();

        System.out.println("Informe o valor do produto R$: ");
        double valor = scan.nextDouble();

        double desconto = valor * 0.3;
        double valorFinal = valor - desconto;

        System.out.println("Valor do desconto: " + desconto);
        System.out.println("O valor final do produto é R$: " + valorFinal);

    }
}
