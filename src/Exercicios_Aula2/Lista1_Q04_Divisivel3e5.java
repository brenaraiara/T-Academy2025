package Exercicios_Aula2;

import java.util.Scanner;

public class Lista1_Q04_Divisivel3e5 {
   //Verifique se um número é divisível por 3 e 5.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scan.nextInt();

        boolean divisivelPor3 = numero % 3 == 0;
        boolean divisivelPor5 = numero % 5 == 0;


        if (divisivelPor3 && divisivelPor5) {
            System.out.println("O número é divisível por 3 e 5.");
        } else if (divisivelPor3) {
            System.out.println("O número é divisivel apenas por 3.");
        } else if (divisivelPor5) {
            System.out.println("O número é divisivel apenas por 5.");
        } else {
            System.out.println("O número não é divisível por 3 nem por 5");
        }
        scan.close();
    }
}
