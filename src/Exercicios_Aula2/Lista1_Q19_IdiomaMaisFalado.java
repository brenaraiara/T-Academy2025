package Exercicios_Aula2;

import java.util.Scanner;

public class Lista1_Q19_IdiomaMaisFalado {
    //Decida qual é o idioma mais falado entre três opções.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o primeiro idioma: ");
        String idioma1 = scan.nextLine();

        System.out.print("Informe o segundo idioma: ");
        String idioma2 = scan.nextLine();

        System.out.print("Informe o terceiro idioma: ");
        String idioma3 = scan.nextLine();

        System.out.println("Quantas pessoas falam " + idioma1 + "?");
        int valor1 = scan.nextInt();

        System.out.println("Quantas pessoas falam " + idioma2 + "?");
        int valor2 = scan.nextInt();

        System.out.println("Quantas pessoas falam " + idioma3 + "?");
        int valor3 = scan.nextInt();

        if (valor1 > valor2 && valor1 > valor3){
            System.out.println("O " + idioma1 + " é o idioma mais falado.");
        } else if (valor2>valor1 && valor2>valor3) {
            System.out.println("O " + idioma2 + " é o idioma mais falado.");
        }else {
            System.out.println("O " + idioma3 + " é o idioma mais falado.");
        }
        scan.close();
    }
}
