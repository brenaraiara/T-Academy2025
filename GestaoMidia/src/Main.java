import Controller.AnimeController;
import Controller.FilmeController;
import Controller.SerieController;
import Model.Anime;
import Model.Filme;
import Model.Genero;
import Model.Serie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnimeController animes = new AnimeController();
        SerieController series = new SerieController();
        FilmeController filmes = new FilmeController();
        Scanner sc = new Scanner(System.in);

        animes.adicionar(new Anime("The Fragrant Flower Blooms with Dignity", 2023, Genero.ROMANCE, Anime.Estacao.PRIMAVERA));
        animes.adicionar(new Anime("Higurashi no Naku Koro ni", 2006, Genero.TERROR, Anime.Estacao.VERAO));
        animes.adicionar(new Anime("Demon Slayer", 2019, Genero.ACAO, Anime.Estacao.INVERNO));

        series.adicionar(new Serie("Criminal Minds", 2005, Genero.SUSPENSE, 16));
        series.adicionar(new Serie("Arquivo X", 1993, Genero.SUSPENSE, 11));
        series.adicionar(new Serie("Wandinha", 2022, Genero.FANTASIA, 2));


        filmes.adicionar(new Filme("Bolha Assassina", 1988, Genero.COMEDIA, "Chuck Russell"));
        filmes.adicionar(new Filme("Lalaland", 2016, Genero.ROMANCE, "Damien Chazelle"));
        filmes.adicionar(new Filme("O Náufrago", 2000, Genero.DRAMA, "Robert Zemeckis"));

        int menuInicial;
        do {
            System.out.println("***** Menu Principal *****");
            System.out.println("1 - Filmes");
            System.out.println("2 - Series");
            System.out.println("3 - Animes");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            menuInicial = sc.nextInt();
            sc.nextLine();

            switch (menuInicial){
                case 1 -> menuFilmes(sc, filmes);
                case 2 -> menuSeries(sc, series);
                case 3 -> menuAnimes(sc, animes);
                case 0 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida!");
            }
        }while (menuInicial !=0);
    }

    private static void menuFilmes(Scanner sc, FilmeController filmes){
        int menuInternoFilmes;
        do {
            System.out.println("\n--- MENU FILMES ---");
            System.out.println("1 - Listar");
            System.out.println("2 - Adicionar");
            System.out.println("3 - Remover");
            System.out.println("4 - Buscar por ID");
            System.out.println("5 - Buscar por Diretor");
            System.out.println("6 - Buscar por Ano");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            menuInternoFilmes = sc.nextInt();
            sc.nextLine();

            switch (menuInternoFilmes) {
                case 1 -> filmes.listar();
                case 2 -> {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Ano: ");
                    int ano = sc.nextInt(); sc.nextLine();
                    System.out.print("Gênero: ");
                    String genero = sc.nextLine();
                    System.out.print("Diretor: ");
                    String diretor = sc.nextLine();
                    filmes.adicionar(new Filme(nome, ano, Genero.valueOf(genero.toUpperCase()), diretor));
                    System.out.println("Filme " + nome + " adicionado com sucesso!");
                }
                case 3 -> {
                    System.out.print("ID do filme a remover: ");
                    int id = sc.nextInt(); sc.nextLine();
                    Filme f = filmes.buscarPorId(id);
                    if (f != null) filmes.remover(f);
                }
                case 4 -> {
                    System.out.print("ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    Filme f = filmes.buscarPorId(id);
                    System.out.println(f != null ? f : "Não encontrado.");
                }
                case 5 -> {
                    System.out.print("Diretor: ");
                    String dir = sc.nextLine();
                    System.out.println(filmes.buscaPorDiretor(dir));
                }
                case 6 -> {
                    System.out.print("Ano: ");
                    int ano = sc.nextInt(); sc.nextLine();
                    System.out.println(filmes.buscaPorAno(ano));
                }
                case 0 -> System.out.println("Voltando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (menuInternoFilmes != 0);
    }
    private static void menuSeries(Scanner sc, SerieController series) {
        int menuinternoSeries;
        do {
            System.out.println("\n--- MENU SÉRIES ---");
            System.out.println("1 - Listar");
            System.out.println("2 - Adicionar");
            System.out.println("3 - Remover");
            System.out.println("4 - Buscar por ID");
            System.out.println("5 - Buscar por Número de Temporadas");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            menuinternoSeries = sc.nextInt(); sc.nextLine();

            switch (menuinternoSeries) {
                case 1 -> series.listar();
                case 2 -> {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Ano: ");
                    int ano = sc.nextInt(); sc.nextLine();
                    System.out.print("Gênero: ");
                    String genero = sc.nextLine();
                    System.out.print("Número de temporadas: ");
                    int temporadas = sc.nextInt(); sc.nextLine();
                    series.adicionar(new Serie(nome, ano, Genero.valueOf(genero.toUpperCase()), temporadas));
                    System.out.println("Serie " + nome + " adicionada com sucesso!");
                }
                case 3 -> {
                    System.out.print("ID da série a remover: ");
                    int id = sc.nextInt(); sc.nextLine();
                    Serie s = series.buscarPorId(id);
                    if (s != null) series.remover(s);
                    else System.out.println("Não encontrada.");
                }
                case 4 -> {
                    System.out.print("ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    Serie s = series.buscarPorId(id);
                    System.out.println(s != null ? s : "Não encontrada.");
                }
                case 5 -> {
                    System.out.print("Número de temporadas: ");
                    int temp = sc.nextInt(); sc.nextLine();
                    System.out.println(series.buscaPorTemporada(temp));
                }
                case 0 -> System.out.println("Voltando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (menuinternoSeries != 0);
    }
    private static void menuAnimes(Scanner sc, AnimeController animes) {
        int menuInternoAnimes;
        do {
            System.out.println("\n--- MENU ANIMES ---");
            System.out.println("1 - Listar");
            System.out.println("2 - Adicionar");
            System.out.println("3 - Remover");
            System.out.println("4 - Buscar por ID");
            System.out.println("5 - Buscar por Estação");
            System.out.println("6 - Buscar por Ano");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            menuInternoAnimes = sc.nextInt(); sc.nextLine();

            switch (menuInternoAnimes) {
                case 1 -> animes.listar();
                case 2 -> {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Ano: ");
                    int ano = sc.nextInt(); sc.nextLine();
                    System.out.print("Gênero: ");
                    String genero = sc.nextLine();
                    System.out.print("Estação (PRIMAVERA, VERAO, OUTONO, INVERNO): ");
                    String est = sc.nextLine().toUpperCase();
                    animes.adicionar(new Anime(nome, ano, Genero.valueOf(genero.toUpperCase()), Anime.Estacao.valueOf(est)));
                    System.out.println("Anime " + nome + " adicionado com sucesso!");
                }
                case 3 -> {
                    System.out.print("ID do anime a remover: ");
                    int id = sc.nextInt(); sc.nextLine();
                    Anime a = animes.buscarPorId(id);
                    if (a != null) animes.remover(a);
                    else System.out.println("Não encontrado.");
                }
                case 4 -> {
                    System.out.print("ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    Anime a = animes.buscarPorId(id);
                    System.out.println(a != null ? a : "Não encontrado.");
                }
                case 5 -> {
                    System.out.print("Estação (PRIMAVERA, VERAO, OUTONO, INVERNO): ");
                    String est = sc.nextLine().toUpperCase();
                    System.out.println(animes.buscaPorEstacao(Anime.Estacao.valueOf(est)));
                }
                case 6 -> {
                    System.out.print("Ano: ");
                    int ano = sc.nextInt(); sc.nextLine();
                    System.out.println(animes.buscaPorAno(ano));
                }
                case 0 -> System.out.println("Voltando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (menuInternoAnimes != 0);
    }
}