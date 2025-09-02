package Exercicios_Aula2;

import java.util.Scanner;

public class Lista1_Q26_SomaNumerosPrimos {
    //Verifique se um número é a soma de dois números primos.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o número que gostaria de verificar: ");
        int numero = scan.nextInt();

        boolean combinacaoEncontrada = false;
        int i = 2;

        while (i <= numero / 2) {
            int complemento = numero - i;

            if (ehPrimo(i) && ehPrimo(complemento)) {
                System.out.println(numero + " = " + i + " + " + complemento+". O número escolhido é a soma de dois números primos.");
                combinacaoEncontrada = true;
                break;
            }
            i++;
        }
        if (!combinacaoEncontrada) {
            System.out.println("O número escolhidos não é soma de dois números primos.");
        }
        scan.close();
    }

    public static boolean ehPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}