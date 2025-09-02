package Exercicios_Aula2;

import java.time.Year;
import java.util.Scanner;

public class Lista1_Q07_AnoBissexto {
    // Determine se um ano é bissexto ou não.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o ano: ");
        int ano = scan.nextInt();

        if (ano <= 0) {
            System.out.println("Ano Inválido! Informe um valor maior que zero.");
        } else if (Year.isLeap(ano)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
        scan.close();
    }
}
