package Exercicios_Aula3;

import java.util.Scanner;

public class Lista2_Q09_OrdemDecrescente {
    //Faça um Programa que leia três números e mostre-os em ordem decrescente.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = scan.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = scan.nextInt();

        System.out.println("Ordem decrescente: ");

        if (n1 >= n2 && n2 >= n3) {
            System.out.println(n1 + ", " + n2 + ", " + n3);
        } else if (n1 >= n3 && n3 >= n2) {
            System.out.println(n1 + ", " + n3 + ", " + n2);
        } else if (n2 >= n1 && n1 >= n3) {
            System.out.println(n2 + ", " + n1 + ", " + n3);
        } else if (n2 >= n3 && n3 >= n1) {
            System.out.println(n2 + ", " + n3 + ", " + n1);
        } else if (n3 >= n1 && n1 >= n2) {
            System.out.println(n3 + ", " + n1 + ", " + n2);
        } else {
            System.out.println(n3 + ", " + n2 + ", " + n1);
        }
        scan.close();
    }
}
