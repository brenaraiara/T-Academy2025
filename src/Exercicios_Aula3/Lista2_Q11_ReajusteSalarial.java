package Exercicios_Aula3;

import java.util.Scanner;

public class Lista2_Q11_ReajusteSalarial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salarioInicial;

        System.out.print("Informe seu salario inicial: R$ ");
        salarioInicial = scan.nextDouble();

        double porcentagem = 0;

        if (salarioInicial <= 280) {
            porcentagem = 20;
        } else if (salarioInicial > 280 && salarioInicial <= 700) {
            porcentagem = 15;
        } else if (salarioInicial > 700 && salarioInicial <= 1500) {
            porcentagem = 10;
        } else {
            porcentagem = 5;
        }
        double aumento = (salarioInicial * (porcentagem / 100));
        double salarioFinal = salarioInicial + aumento;

        System.out.println("Seu salário final é de " + salarioFinal);

        scan.close();
    }
}
