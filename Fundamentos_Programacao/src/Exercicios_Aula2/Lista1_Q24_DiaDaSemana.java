package Exercicios_Aula2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Lista1_Q24_DiaDaSemana {
    //Decida qual é o dia da semana para uma data específica.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a data (formato: dd/MM/yyyy): ");
        String entrada = scan.nextLine();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(entrada, formato);

        DayOfWeek diaSemana = data.getDayOfWeek();

        String nomeDia = "";

        if (diaSemana == DayOfWeek.MONDAY) {
            nomeDia = "Segunda-feira";
        } else if (diaSemana == DayOfWeek.TUESDAY) {
            nomeDia = "Terça-feira";
        } else if (diaSemana == DayOfWeek.WEDNESDAY) {
            nomeDia = "Quarta-feira";
        } else if (diaSemana == DayOfWeek.THURSDAY) {
            nomeDia = "Quinta-feira";
        } else if (diaSemana == DayOfWeek.FRIDAY) {
            nomeDia = "Sexta-feira";
        } else if (diaSemana == DayOfWeek.SATURDAY) {
            nomeDia = "Sábado";
        } else if (diaSemana == DayOfWeek.SUNDAY) {
            nomeDia = "Domingo";
        }
        System.out.println("A data corresponde a: " + nomeDia);
    }
}
