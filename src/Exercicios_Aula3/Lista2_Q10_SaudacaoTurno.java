package Exercicios_Aula3;

import java.util.Scanner;

public class Lista2_Q10_SaudacaoTurno {
    //Faça um Programa que pergunte em que turno você estuda. Peça para digitar
    //M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Em qual turno você estuda?: ");
        char turno = Character.toUpperCase(scan.next().charAt(0));

        if (turno == 'M') {
            System.out.println("Turno Matutino - Bom dia!");
        } else if (turno == 'V') {
            System.out.println("Turno Vespertino - Boa tarde!");
        } else if (turno == 'N') {
            System.out.println("Turno Noturno - Boa noite!");
        } else {
            System.out.println("Turno inválido!");
        }
    }
}
