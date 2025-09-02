package Exercicios_Aula1;

import java.util.Scanner;

public class DadosCientificos_Animais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o domínio do animal: ");
        String dominio = scan.nextLine();

        System.out.println("Informe o reino do animal: ");
        String reino = scan.nextLine();

        System.out.println("Informe o filo do animal: ");
        String filo = scan.nextLine();

        System.out.println("Informe o classe do animal: ");
        String classe = scan.nextLine();

        System.out.println("Informe o ordem do animal: ");
        String ordem = scan.nextLine();

        System.out.println("Informe o familia do animal: ");
        String familia = scan.nextLine();

        System.out.println("Informe o genero do animal: ");
        String genero = scan.nextLine();

        System.out.println("Informe o especie do animal: ");
        String especie = scan.nextLine();

        System.out.println("O animal escolhido pertence ao domínio "
                + dominio+ ", do reino " +reino+ ", do filo "
                +filo+ ", da classe " +classe+ ", da ordem "
                +ordem+ ", da familia "+familia+ ", do genero "
                + genero+ " e da espécie "+ especie);
    }
}
