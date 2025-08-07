package Exercicios_Aula2;

import java.util.Scanner;

public class Lista1_Q17_DescontoProduto {
    //Calcule o desconto aplicado a um produto com base no valor da compra.
    //Será considerado desconto de 10% para valores de ate 100 reais, 15% de 100 ate 500 e 20% acima de 500

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor do produto: R$ ");
        double valor = scan.nextDouble();

        double desconto;

        if (valor <= 100) {
            desconto = valor * 0.10;
        } else if (valor > 100 && valor <= 500) {
            desconto = valor * 0.15;
        } else {
            desconto = valor * 0.20;
        }
        double valorFinal = valor - desconto;

        System.out.println("O desconto aplicado foi de: R$ " + desconto);
        System.out.println("O valor final do produto é: R$ " + valorFinal);
        scan.close();
    }
}
