package Exercicios_Aula1;

import java.util.Scanner;

public class Area_Retangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("informe a base do retangulo: ");
        double base = scan.nextDouble();

        System.out.println("informe a altura do retangulo: ");
        double altura = scan.nextDouble();

        double area = base * altura;

        System.out.println("A area do seu retangulo é: " + area + " centimetros");

        scan.close();
    }
}
