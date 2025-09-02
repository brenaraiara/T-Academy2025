package Exercicios_Aula1;

import java.time.LocalDate;
import java.util.Scanner;

public class Calculo_Idade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu ano de nascimento: ");
        int anoNascimento = scan.nextInt();

        int anoAtual = LocalDate.now().getYear();

        int idadeAtual = anoAtual  - anoNascimento;

        System.out.println("Sua idade é: " + idadeAtual);

    }
}
