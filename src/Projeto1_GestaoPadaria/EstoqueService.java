package Projeto1_GestaoPadaria;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Scanner;

public class EstoqueService {

    private Estoque estoque;
    private Scanner sc;

    public EstoqueService(Estoque estoque, Scanner sc) {
        this.estoque = estoque;
        this.sc = sc;
    }

    // Verifica se o estoque está vazio
    public boolean estaVazio() {
        return estoque.getItens().isEmpty();
    }

    // Lista todos os itens
    public void listarItens() {
        estoque.listarItens();
    }

    // Remover item do estoque **sem mensagem** (para pedidos)
    public boolean removerItemDoEstoque(String nome, Pedido pedido) {
        for (int i = 0; i < estoque.getItens().size(); i++) {
            if (estoque.getItens().get(i).getProduto().getNome().equalsIgnoreCase(nome)) {
                pedido.adicionarItem(estoque.getItens().get(i));
                estoque.removerItemPeloIndice(i); // versão silenciosa
                return true;
            }
        }
        return false;
    }

    // Menu interno do estoque
    public void menuEstoque() {
        while (true) {
            System.out.println("\n---- MENU ESTOQUE ----");
            System.out.println("1 - Adicionar item ao estoque");
            System.out.println("2 - Remover item do estoque");
            System.out.println("3 - Listar itens do estoque");
            System.out.println("4 - Listar itens do estoque por validade");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> adicionarItem();
                case 2 -> removerItem();
                case 3 -> listarItens();
                case 4 -> listarItensPorValidade();
                case 0 -> { return; }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    // Adicionar item ao estoque
    public void adicionarItem() {
        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("Digite a data de validade (yyyy-MM-dd): ");
        LocalDate validade = LocalDate.parse(sc.nextLine());
        LocalDate producao = LocalDate.now();
        Produto produto = new Produto(nome, 10.0); // Preço fixo ou você pode modificar
        estoque.adicionarItem(produto, producao, validade);
        System.out.println("Item adicionado!");
    }

    // Remover item **com mensagem** (menu)
    public void removerItem() {
        estoque.listarItensComIndice();
        System.out.print("Digite o índice do item para remover: ");
        int index = sc.nextInt() - 1;
        sc.nextLine();
        estoque.removerItemPeloIndiceComMensagem(index);
    }

    // Listar itens por validade
    public void listarItensPorValidade() {
        estoque.getItens().stream()
                .sorted(Comparator.comparing(i -> i.getDataValidade()))
                .forEach(System.out::println);
    }
}
