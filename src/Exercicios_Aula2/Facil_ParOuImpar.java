package Exercicios_Aula2;

import java.util.Scanner;

public class Facil_ParOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número informado é par.");
        } else {
            System.out.println("O número informado é impar.");
        }
        scan.close();
    }
}
