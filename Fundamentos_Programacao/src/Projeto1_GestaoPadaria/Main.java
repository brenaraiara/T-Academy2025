package Projeto1_GestaoPadaria;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Listas e estoque
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        Estoque estoque = new Estoque();

        // Inicializa dados
        DadosIniciais.inicializarDados(clientes, produtos, funcionarios, estoque);

        // Inicializa serviços
        ClienteService clienteService = new ClienteService(clientes, sc);
        ProdutoService produtoService = new ProdutoService(produtos, sc);
        EstoqueService estoqueService = new EstoqueService(estoque, sc);
        PedidoService pedidoService = new PedidoService(pedidos, clientes, funcionarios, estoqueService, sc);

        // Alertas ao iniciar
        System.out.println("\n-----ALERTAS DO DIA-----");

        // ALERTA DE VALIDADE
        System.out.println("\n---- ALERTA DE VALIDADE ----");
        estoque.mostrarAlertaDeValidade(); // imprime apenas os produtos próximos do vencimento

        // ALERTA DE ANIVERSÁRIO DE FUNCIONÁRIO
        System.out.println("\n---- ALERTA DE ANIVERSÁRIO ----");
        Funcionario.mostrarAniversariantesHoje(funcionarios);

        // Loop do menu principal
        while (true) {
            try {
                System.out.println("\n---- MENU PRINCIPAL ----");
                System.out.println("1 - Gerir Clientes");
                System.out.println("2 - Gerir Estoque");
                System.out.println("3 - Gerir Produtos");
                System.out.println("4 - Fazer Pedido");
                System.out.println("5 - Mostrar total de vendas do dia");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");

                int opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1 -> clienteService.menuClientes();             // menu interno do ClienteService
                    case 2 -> estoqueService.menuEstoque();              // menu interno do EstoqueService
                    case 3 -> produtoService.menuProdutos();             // menu interno do ProdutoService
                    case 4 -> pedidoService.fazerPedido();               // realiza pedido
                    case 5 -> pedidoService.mostrarTotalVendasDoDia();   // mostra total de vendas
                    case 0 -> {
                        System.out.println("Saindo do sistema...");
                        return;
                    }
                    default -> System.out.println("Opção inválida! Tente novamente.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
                sc.nextLine();
            }
        }
    }
}
