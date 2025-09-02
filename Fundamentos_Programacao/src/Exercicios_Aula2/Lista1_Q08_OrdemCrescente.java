package Exercicios_Aula2;

import java.util.Scanner;

public class Lista1_Q08_OrdemCrescente {
    //Classifique três números em ordem crescente.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int numero1 = scan.nextInt();

        System.out.print("Informe o segundo número: ");
        int numero2 = scan.nextInt();

        System.out.print("Informe o terceiro número: ");
        int numero3 = scan.nextInt();

        int menor, meio, maior;

        if (numero1 <= numero2 && numero1 <= numero3) {
            menor = numero1;
            if (numero2 <= numero3) {
                meio = numero2;
                maior = numero3;
            } else {
                meio = numero3;
                maior = numero2;
            }
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            menor = numero2;
            if (numero1 <= numero3) {
                meio = numero1;
                maior = numero3;
            } else {
                meio = numero3;
                maior = numero1;
            }
        } else {
            menor = numero3;
            if (numero1 <= numero2) {
                meio = numero1;
                maior = numero2;
            } else {
                meio = numero2;
                maior = numero1;
            }
        }
        System.out.println("A ordem crescente dos números informados é : " + menor + ", " + meio + ", " + maior);

        scan.close();
    }
}
