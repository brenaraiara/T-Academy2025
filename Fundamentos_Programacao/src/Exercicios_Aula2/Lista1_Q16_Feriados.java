package Exercicios_Aula2;

import java.util.Scanner;

public class Lista1_Q16_Feriados {
    //Determine se uma data (dia e mês) é feriado nacional.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o dia: ");
        int dia = scan.nextInt();

        System.out.print("Informe o numero do mês: ");
        int mes = scan.nextInt();

        boolean feriado = (dia == 1 && mes == 1) || (dia == 21 && mes == 4) || (dia == 1 && mes == 5) ||
                (dia == 7 && mes == 9) || (dia == 12 && mes == 10) || (dia == 2 && mes == 11) ||
                (dia == 15 && mes == 11) || (dia == 25 && mes == 12);

        if (feriado) {
            System.out.println("A data escolhida é um feriado nacional.");
        } else {
            System.out.println("A data escolhida não é feriado nacional");
        }
        scan.close();
    }
}
