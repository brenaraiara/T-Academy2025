package Exercicios_Aula2;

import java.util.Scanner;

public class Lista1_Q10_TiposTriangulo {
    //Determine se um triângulo é equilátero, isósceles ou escaleno

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lado1, lado2, lado3;

        System.out.print("Informe o lado1: ");
        lado1 = scan.nextInt();

        System.out.print("Informe o lado2: ");
        lado2 = scan.nextInt();

        System.out.print("Informe o lado3: ");
        lado3 = scan.nextInt();
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triangulo é equilatero.");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("O triangulo é isosceles");
            } else {
                System.out.println("O triangulo é escaleno");
            }

        } else {
            System.out.println("os lados informados NÃO formam um triangulo válido. ");
        }
        scan.close();
    }
}