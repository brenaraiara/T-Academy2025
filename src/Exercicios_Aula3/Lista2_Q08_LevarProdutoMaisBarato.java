package Exercicios_Aula3;

import java.util.Scanner;

public class Lista2_Q08_LevarProdutoMaisBarato {
    //Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor do primeiro produto: R$");
        double valor1 = scan.nextDouble();

        System.out.print("Informe o valor do segundo produto: R$");
        double valor2 = scan.nextDouble();

        System.out.print("Informe o valor do terceiro produto: R$");
        double valor3 = scan.nextDouble();

        if (valor1 <= valor2 && valor1 <= valor3) {
            System.out.println("O produdo de valor R$ " + valor1 + " será levado.");
        } else if (valor2 <= valor1 && valor2 <= valor3) {
            System.out.println("O produdo de valor R$ " + valor2 + " será levado.");
        } else {
            System.out.println("O produdo de valor R$ " + valor3 + " será levado.");
        }
        scan.close();
    }
}
