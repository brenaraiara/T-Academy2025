package Exercicios_Aula3;

import java.util.Scanner;

public class Lista2_Q03_VerificarLetra {
    //Faça um Programa que verifique se uma letra digitada é "F" ou "M" ou “O”. Conforme a letra escrever: F - Feminino, M - Masculino, O - Outro.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe uma letra: ");
        String letra = scan.nextLine().toUpperCase();

        if (letra.equals("F")) {
            System.out.println("Letra escolhida " + letra + " de Feminino");
        } else if (letra.equals("M")) {
            System.out.println("Letra escolhida " + letra + " de Masculino");
        } else if (letra.equals("O")) {
            System.out.println("Letra escolhida " + letra + " de Outros");
        } else {
            System.out.println("Letra inválida, escolha outra letra entre as opções 'F - M - O'!");
        }
        scan.close();
    }
}
