package Exercicios_Aula2;

import java.util.Scanner;

public class Lista1_Q13_NumeroPrimo {
    //Determine se um número é primo ou não.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = scan.nextInt();

        if (numero <= 1) {
            System.out.println("Não é um número primo.");
        } else if (numero == 2 || numero == 3 || numero == 5 || numero == 7) {
            System.out.println("É um número primo.");
        } else if (numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0 || numero % 7 == 0) {
            System.out.println("Não é um número primo.");
        } else {
            System.out.println("É um número primo");
        }
        scan.close();
    }
}
