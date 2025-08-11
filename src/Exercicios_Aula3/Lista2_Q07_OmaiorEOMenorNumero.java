package Exercicios_Aula3;

import java.util.Scanner;

public class Lista2_Q07_OmaiorEOMenorNumero {
    //Faça um Programa que leia três números e mostre o maior e o menor deles.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int numero1 = scan.nextInt();

        System.out.print("Informe o segundo número: ");
        int numero2 = scan.nextInt();

        System.out.print("Informe o terceiro número: ");
        int numero3 = scan.nextInt();

        int maior, menor;

        if (numero1 >= numero2 && numero1 >= numero3) {
            maior = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            maior = numero2;
        } else {
            maior = numero3;
        }

        if (numero1 <= numero2 && numero1 <= numero3) {
            menor = numero1;
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            menor = numero2;
        } else {
            menor = numero3;
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        scan.close();
    }
}
