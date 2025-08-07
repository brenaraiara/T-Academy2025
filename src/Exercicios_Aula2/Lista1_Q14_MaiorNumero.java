package Exercicios_Aula2;

import java.util.Scanner;

public class Lista1_Q14_MaiorNumero {
    //Decida qual é o maior de três números.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int numero1 = scan.nextInt();

        System.out.print("Informe o segundo número: ");
        int numero2 = scan.nextInt();

        System.out.print("Informe o terceiro número: ");
        int numero3 = scan.nextInt();

        int maior;

        if (numero1 >= numero2 && numero1 >= numero3) {
            maior = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            maior = numero2;
        } else {
            maior = numero3;
        }

        System.out.println("O maior número é: " + maior);
        scan.close();
    }
}
