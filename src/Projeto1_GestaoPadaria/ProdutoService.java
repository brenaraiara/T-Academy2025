package Projeto1_GestaoPadaria;

import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoService {

    private ArrayList<Produto> produtos;
    private Scanner sc;

    public ProdutoService(ArrayList<Produto> produtos, Scanner sc) {
        this.produtos = produtos;
        this.sc = sc;
    }

    // Menu interno de produtos
    public void menuProdutos() {
        System.out.println("\n---- GERIR PRODUTOS ----");
        System.out.println("1 - Adicionar novo produto");
        System.out.println("2 - Remover produto");
        System.out.println("3 - Listar todos os produtos");
        System.out.println("4 - Buscar produto por código");
        System.out.println("5 - Editar preço do produto");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1 -> adicionarProduto();
            case 2 -> removerProduto();
            case 3 -> listarProdutos();
            case 4 -> buscarProdutoMenu();
            case 5 -> editarPrecoProduto();
            default -> System.out.println("Opção inválida!");
        }
    }

    public void adicionarProduto() {
        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();
        sc.nextLine();
        produtos.add(new Produto(nome, preco));
        System.out.println("Produto adicionado com sucesso!");
    }

    public void removerProduto() {
        listarProdutos();
        System.out.print("Digite o código do produto a ser removido: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        boolean removido = produtos.removeIf(p -> p.getCodigo() == codigo);
        if (removido) System.out.println("Produto removido com sucesso!");
        else System.out.println("Produto não encontrado.");
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        System.out.println("---- LISTA DE PRODUTOS ----");
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }

    public void buscarProdutoMenu() {
        System.out.print("Digite o código do produto: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        Produto p = buscarProduto(codigo);
        if (p != null) System.out.println("Produto encontrado: " + p);
        else System.out.println("Produto não encontrado.");
    }

    public Produto buscarProduto(int codigo) {
        for (Produto p : produtos) {
            if (p.getCodigo() == codigo) return p;
        }
        return null;
    }

    public void editarPrecoProduto() {
        System.out.print("Digite o código do produto: ");
        int codigo = sc.nextInt();
        System.out.print("Digite o novo preço do produto: ");
        double precoNovo = sc.nextDouble();
        sc.nextLine();
        Produto p = buscarProduto(codigo);
        if (p != null) {
            p.setPreco(precoNovo);
            System.out.println("Preço atualizado: " + p);
        } else System.out.println("Produto não encontrado.");
    }
}
