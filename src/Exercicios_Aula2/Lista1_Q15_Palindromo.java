package Exercicios_Aula2;

import java.util.Scanner;

public class Lista1_Q15_Palindromo {
    //Verifique se uma string é um palíndromo.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scan.nextLine().toLowerCase();

        String invertida = new StringBuilder(palavra).reverse().toString();

        if (palavra.equals(invertida)) {
            System.out.println("É um palindromo.");
        } else {
            System.out.println("Não é um palindromo.");
        }
        scan.close();
    }
}
