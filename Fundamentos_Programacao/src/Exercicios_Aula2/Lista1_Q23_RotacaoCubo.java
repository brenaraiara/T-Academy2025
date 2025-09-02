package Exercicios_Aula2;

import java.util.Scanner;

public class Lista1_Q23_RotacaoCubo {
    // Determine a rotação máxima de um cubo para que ele fique igual a outro cubo.
    // Sugestão de resolução, usando apenas rotações simples, usando somente a face voltada para cima.
    // Questão pode ser melhorada incluindo as seis faces

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a face atual voltada para cima (1 a 6): ");
        int atual = scan.nextInt();

        System.out.print("Informe a face desejada para cima (1 a 6): ");
        int desejada = scan.nextInt();

        if (atual == desejada) {
            System.out.println("O cubo já está na posição correta (0º de rotação)");
        } else if ((atual == 1 && desejada == 2) || (atual == 2 && desejada == 3)) {
            System.out.println("Rotação de 90º necessária.");
        } else if ((atual == 1 && desejada == 3) || (atual == 2 && desejada == 4)) {
            System.out.println("Rotação de 180º necessária");
        } else if ((atual == 1 && desejada == 4) || (atual == 2 && desejada == 1)) {
            System.out.println("Rotação de 270º necessária");
        } else {
            System.out.println("Essa rotação não foi mapeada por enquanto.");
        }
        scan.close();
    }
}
