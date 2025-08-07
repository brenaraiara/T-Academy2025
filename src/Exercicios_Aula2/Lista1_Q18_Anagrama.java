package Exercicios_Aula2;

import java.util.Arrays;
import java.util.Scanner;

public class Lista1_Q18_Anagrama {
    //Verifique se uma palavra é um anagrama de outra.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scan.nextLine().toLowerCase();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scan.nextLine().toLowerCase();

        if (anagrama(palavra1, palavra2)) {
            System.out.println("São anagramas!");
        } else {
            System.out.println("Não são anagramas.");
        }
        scan.close();
    }

    public static boolean anagrama(String p1, String p2) {
        if (p1.length() != p2.length()) {
            return false;
        }
        char[] letras1 = p1.toCharArray();
        char[] letras2 = p2.toCharArray();

        Arrays.sort(letras1);
        Arrays.sort(letras2);

        return Arrays.equals(letras1, letras2);

    }

}
