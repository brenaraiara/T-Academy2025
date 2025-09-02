package Exercicios_Aula2;

import java.util.Scanner;

public class Lista1_Q22_Fibonacci {
    //Verifique se um número é parte da sequência de Fibonacci.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scan.nextInt();

        if (numero < 0) {
            System.out.println("Não existe números negativos na sequencia de Finonacci.");
            return;
        }
        int a = 0, b = 1;

        if (numero == 0 || numero == 1) {
            System.out.println(numero + " pertence à sequencia de Fibonacci.");
            return;
        }

        int proximo = a + b;

        while (proximo <= numero) {
            if (proximo == numero) {
                System.out.println("O número " + numero + " pertence à sequencia de Fibonacci.");
                return;
            }
            a = b;
            b = proximo;
            proximo = a + b;
        }
        System.out.println("O número "+ numero + " NÃO pertence à sequencia de Fibonacci.");
    }
}
