package Exercicios_Aula5;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleDeMonstros {

    static ArrayList<Monstro> monstros = new ArrayList<>();
    static String[] tipos = {"Fogo", "Água", "Planta", "Luta", "Ar"};
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===MENU===");
            System.out.println("(1) - Novo Monstro");
            System.out.println("(2) - Lista de Monstro");
            System.out.println("(3) - Ver Monstro Específico");
            System.out.println("(4) - Remover Monstro");
            System.out.println("(0) - Sair");
            System.out.println("Opção: ");
            int menu = lerInteiro();

            if (menu == 0) break;

            switch (menu) {
                case 1 -> cadastrarNovoMonstro();
                case 2 -> listaDeMonstros();
                case 3 -> mostrarMonstroEspecifico();
                case 4 -> removerMonstro();
                default -> System.out.println("Opção Inválida");
            }
        }
        System.out.println("Programa encerrado!");
    }

    public static void cadastrarNovoMonstro() {
        scan.nextLine();
        System.out.print("Nome do monstro: ");
        String nome = scan.nextLine();

        System.out.println("\nTipo de monstro: ");
        mostrarTipos();
        int tipoMonstro = lerIndiceTipo();

        System.out.println("\nFraqueza do monstro: ");
        mostrarTipos();
        int fraqueza = lerIndiceTipo();

        monstros.add(new Monstro(nome, tipoMonstro, fraqueza));
        System.out.println("Monstro cadastrado com sucesso!");
    }

    public static void listaDeMonstros() {
        if (monstros.isEmpty()) {
            System.out.println("Nenhum monstro cadastrado!");
            return;
        }
        System.out.println("\n===LISTA DE MOSTROS===");
        for (int i = 0; i < monstros.size(); i++) {
            System.out.println("(" + i + ") " + monstros.get(i).resumo());
        }
    }

    public static void mostrarMonstroEspecifico() {
        if (monstros.isEmpty()) {
            System.out.println("Nenhum monstro cadastrado!");
            return;
        }
        listaDeMonstros();
        System.out.println("Informe o índice do monstro: ");
        int indice = lerIndiceMonstro();
        System.out.println(monstros.get(indice));
    }

    public static void removerMonstro() {
        if (monstros.isEmpty()) {
            System.out.println("Nenhum monstro para remover!");
            return;
        }
        listaDeMonstros();
        System.out.println("Informe o índice do monstro para remover: ");
        int indice = lerIndiceMonstro();
        Monstro removido = monstros.remove(indice);
        System.out.println("Monstro removido: " + removido.getNome());
    }

    public static void mostrarTipos() {
        for (int i = 0; i < tipos.length; i++) {
            System.out.println("(" + i + ") " + tipos[i]);
        }
    }

    public static int lerInteiro() {
        while (!scan.hasNextInt()) {
            System.out.println("Digite um número válido: ");
            scan.next();
        }
        return scan.nextInt();
    }

    public static int lerIndiceTipo() {
        int indice;
        while (true) {
            indice = lerInteiro();
            if (indice >= 0 && indice < tipos.length) {
                return indice;
            }
            System.out.println("Opção inválida! Digite novamente: ");
        }
    }

    public static int lerIndiceMonstro() {
        int indice;
        while (true) {
            indice = lerInteiro();
            if (indice >= 0 && indice < monstros.size()) {
                return indice;
            }
            System.out.println("Opção inválida! Digite novamente: ");
        }
    }
}

class Monstro {
    private String nome;
    private int tipo;
    private int fraqueza;
    private static final String[] tipos = {"Fogo", "Água", "Planta", "Luta", "Ar"};

    public Monstro(String nome, int tipo, int fraqueza) {
        this.nome = nome;
        this.tipo = tipo;
        this.fraqueza = fraqueza;
    }

    public String getNome() {
        return nome;
    }

    public String resumo() {
        return nome + " - Tipo: " + tipos[tipo] + " | Fraqueza: " + tipos[fraqueza];
    }

    @Override
    public String toString() {
        return "\n===MONSTROS===" +
                "\nNome: " + nome +
                "\nTipo: " + tipos[tipo] +
                "\nFraqueza: " + tipos[fraqueza];
    }
}
