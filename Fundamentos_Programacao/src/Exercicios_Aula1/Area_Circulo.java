package Exercicios_Aula1;

import java.util.Scanner;

public class Area_Circulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("nforme o valor do raio: ");
        double raio = scan.nextDouble();

        double area = Math.pow(raio, 2)*Math.PI;

        System.out.println("A area do circulo é: " + area);
    }
}
