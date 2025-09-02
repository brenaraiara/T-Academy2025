package Exercicios_Aula2;

import java.util.Scanner;

public class Lista1_Q20_OrdemDecrescente {
    // Classifique um conjunto de números em ordem decrescente
    // Como não foi dito a quantidade de numeros do conjunto, levaremos em consideração um conjunto com apenas três algarismos

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
