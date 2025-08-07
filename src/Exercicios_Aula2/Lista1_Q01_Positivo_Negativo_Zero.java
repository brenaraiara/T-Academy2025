package Exercicios_Aula2;

import java.util.Scanner;

public class Lista1_Q01_Positivo_Negativo_Zero {
    //Verifique se um número é positivo, negativo ou zero.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scan.nextInt();

        if (numero > 0) {
            System.out.println("O número informado é positivo");
        } else if (numero < 0) {
            System.out.println("O número informado é negativo");
        } else {
            System.out.println("O número informado é zero");
        }
        scan.close();
    }
}
