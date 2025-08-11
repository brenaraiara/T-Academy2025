package Exercicios_Aula3;

import java.util.Scanner;

public class Lista2_Q12_FolhaDePagamento {
    //Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme
    //tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário
    //Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no
    //mês. Desconto do IR:
    //  Salário Bruto até 900 (inclusive) - isento
    //  Salário Bruto até 1500 (inclusive) - desconto de 5%
    //  Salário Bruto até 2500 (inclusive) - desconto de 10%
    //  Salário Bruto acima de 2500 - desconto de 20%
    //  Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salarioBruto;
        double INSS = 0.10;

        System.out.print("Informe seu salario: R$ ");
        salarioBruto = scan.nextDouble();

        double impostoDeRenda;

        if (salarioBruto <= 900) {
            impostoDeRenda = 0;
        } else if (salarioBruto <= 1500) {
            impostoDeRenda = 5;
        } else if (salarioBruto <= 2500) {
            impostoDeRenda = 10;
        } else {
            impostoDeRenda = 20;
        }
        double valorINSS = salarioBruto * INSS;
        double valorIR = salarioBruto * (impostoDeRenda / 100);
        double descontoTotal = valorINSS + valorIR;
        double salarioLiquido = salarioBruto - descontoTotal;

        System.out.println("Seu salario será: R$ " + salarioLiquido);

        scan.close();
    }
}
