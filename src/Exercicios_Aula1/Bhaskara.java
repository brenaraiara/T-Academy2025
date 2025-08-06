package Exercicios_Aula1;

import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de a, b e c: ");
        double a, b, c;
        double delta;
        double x1, x2;

        System.out.println("a: ");
        a = scan.nextDouble();

        System.out.println("b: ");
        b = scan.nextDouble();

        System.out.println("c: ");
        c = scan.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Delta negativo, a equação não possui raizes reais");
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        }
    }
}
