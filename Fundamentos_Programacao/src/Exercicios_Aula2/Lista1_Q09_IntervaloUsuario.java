package Exercicios_Aula2;

import java.util.Scanner;

public class Lista1_Q09_IntervaloUsuario {
    //Verifique se um número está dentro de um intervalo especificado pelo usuario.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o limite inferior do intervalo: ");
        int limiteInferior = scan.nextInt();

        System.out.print("Informe o limite superior do intervalo: ");
        int limiteSuperior = scan.nextInt();

        System.out.print("Informe o número a ser verificado: ");
        int numero = scan.nextInt();

        if (numero >= limiteInferior && numero <= limiteSuperior) {
            System.out.println("O número informado está dentro do intervalo de " + limiteInferior + " a " + limiteSuperior + ".");
        } else {
            System.out.println("O número não está dentro do intervalo de " + limiteInferior + " a " + limiteSuperior + ".");
        }
        scan.close();
    }
}
