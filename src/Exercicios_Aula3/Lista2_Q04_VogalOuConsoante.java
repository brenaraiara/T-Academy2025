package Exercicios_Aula3;

import java.util.Scanner;

public class Lista2_Q04_VogalOuConsoante {
    //Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        String letra = scan.next().toLowerCase();

        if (letra.length() > 1) {
            System.out.println("Digite somente um caracter");
            System.out.println(0);
        }

        if ("aeiou".contains(letra)) {
            System.out.println("A letra informada é uma vogal");
        } else if ("1234567890".contains(letra)) {
            System.out.println("Você digitou um número");
        } else {
            System.out.println("A letraa informada é uma consoante");
        }
    }
}