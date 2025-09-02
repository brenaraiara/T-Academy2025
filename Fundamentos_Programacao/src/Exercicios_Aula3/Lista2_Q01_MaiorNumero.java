package Exercicios_Aula3;

import java.util.Scanner;

public class Lista2_Q01_MaiorNumero {
    //Faça um Programa que peça dois números e imprima o maior deles.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int numero1 = scan.nextInt();

        System.out.println("Informe o segundo número: ");
        int numero2 = scan.nextInt();

        if (numero1 > numero2) {
            System.out.println("O maior número entre os escolhidos é: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior número entre os escolhidos é: " + numero2);
        } else {
            System.out.println("Os números são iguais");
        }
        scan.close();
    }
}
