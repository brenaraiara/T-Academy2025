package Exercicios_Aula2;

import java.util.Scanner;

public class Lista1_Q25_RaizCubica {
    //Calcule a raiz cúbica de um número usando o metodo de Newton-Raphson.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número para calcularf a raiz cúbica: ");
        double numero = scan.nextDouble();

        double x = numero / 2;
        double erroPermitido = 0.01;
        double erro = Double.MAX_VALUE;

        while (erro > erroPermitido) {
            double xNovo = (2 * x + numero / (x * x)) / 3;
            erro=Math.abs(xNovo-x);
            x = xNovo;
        }
        System.out.printf("A raiz cubica aproximada de %.2f é %.2f%n", numero, x);
    }
}
