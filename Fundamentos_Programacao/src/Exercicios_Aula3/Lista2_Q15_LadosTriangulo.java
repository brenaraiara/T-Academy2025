package Exercicios_Aula3;

import java.util.Scanner;

public class Lista2_Q15_LadosTriangulo {
    // Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem
    //um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
    //Dicas: Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
    //Triângulo Equilátero: três lados iguais;
    //Triângulo Isósceles: quaisquer dois lados iguais;
    //Triângulo Escaleno: três lados diferentes;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("===Informe os lados do triangulo===");
        int lado1, lado2, lado3;

        System.out.print("Informe o lado1: ");
        lado1 = scan.nextInt();

        System.out.print("Informe o lado2: ");
        lado2 = scan.nextInt();

        System.out.print("Informe o lado3: ");
        lado3 = scan.nextInt();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            ;

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é equilatero.");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("O triângulo é isosceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo.");
        }
        scan.close();
    }
}
