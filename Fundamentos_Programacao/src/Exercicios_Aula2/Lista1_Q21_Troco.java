package Exercicios_Aula2;

import java.util.Scanner;

public class Lista1_Q21_Troco {
    //Determine a quantidade de troco a ser entregue com base em um valor pago.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do produto: R$ ");
        double valorProduto = scan.nextDouble();

        System.out.print("Informe a quantia usada para pagamento: R$ ");
        double quantia = scan.nextDouble();

        if (quantia < valorProduto) {
            double falta = valorProduto - quantia;
            System.out.printf("Valor insuficiente. Faltam R$ %.2f\n", falta);
        } else if (quantia == valorProduto) {
            System.out.println("Pagamento exato. Não há troco.");
        } else {
            double troco = quantia - valorProduto;
            System.out.printf("O valor do seu troco é: R$ %.2f\n", troco);
        }
    }
}
