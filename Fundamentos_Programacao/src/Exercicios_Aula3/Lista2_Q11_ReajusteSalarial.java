package Exercicios_Aula3;

import java.util.Scanner;

public class Lista2_Q11_ReajusteSalarial {
    // As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes.
    //Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
    //salários até R$ 280,00 (incluindo) : de 20%
    //salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
    //salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
    //salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser
    //realizado, informe na tela:
    //o salário antes do reajuste;
    //o percentual de aumento aplicado;
    //o valor do aumento;
    //o novo salário, após o aumento.

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
