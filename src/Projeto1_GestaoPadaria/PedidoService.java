package Projeto1_GestaoPadaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class PedidoService {

    private ArrayList<Pedido> pedidos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Funcionario> funcionarios;
    private EstoqueService estoqueService;
    private Scanner sc;

    public PedidoService(ArrayList<Pedido> pedidos,
                         ArrayList<Cliente> clientes,
                         ArrayList<Funcionario> funcionarios,
                         EstoqueService estoqueService,
                         Scanner sc) {
        this.pedidos = pedidos;
        this.clientes = clientes;
        this.funcionarios = funcionarios;
        this.estoqueService = estoqueService;
        this.sc = sc;
    }

    public void fazerPedido() {
        if (estoqueService.estaVazio()) {
            System.out.println("O estoque está vazio. Não é possível realizar pedidos.");
            return;
        }

        Pedido pedido = new Pedido();
        boolean itemEncontrado;

        System.out.println("\n---- REALIZANDO PEDIDO ----");
        while (true) {
            estoqueService.listarItens();
            System.out.print("Digite o nome do item que deseja comprar: ");
            String nome = sc.nextLine();

            itemEncontrado = estoqueService.removerItemDoEstoque(nome, pedido);
            if (!itemEncontrado) {
                System.out.println(nome + " - Item não existe.");
            } else {
                System.out.println(nome + " - Adicionado ao pedido.");
            }

            if (estoqueService.estaVazio()) {
                System.out.println("O estoque está vazio.");
                break;
            }

            System.out.print("Deseja finalizar o pedido? (s/n) ");
            String finalizar = sc.nextLine();
            if (finalizar.equalsIgnoreCase("s")) break;
        }

        // Fidelidade
        System.out.print("O cliente tem fidelidade? (s/n) ");
        String fidelidade = sc.nextLine();
        if (fidelidade.equalsIgnoreCase("s")) {
            System.out.print("Digite o CPF: ");
            String cpf = sc.nextLine();

            boolean existe = false;
            for (Cliente cliente : clientes) {
                if (cliente.getCpf().equals(cpf)) {
                    pedido.setCliente(cliente);
                    System.out.println("Bem-vindo " + cliente.getNome());
                    existe = true;

                    // Verificar aniversário
                    LocalDate hoje = LocalDate.now();
                    if (cliente.getDataNascimento() != null &&
                            cliente.getDataNascimento().getDayOfMonth() == hoje.getDayOfMonth() &&
                            cliente.getDataNascimento().getMonth() == hoje.getMonth()) {

                        System.out.println("Parabéns! Hoje é aniversário do cliente " + cliente.getNome() + "!");
                    }

                    break;
                }
            }
            if (!existe) System.out.println("CPF não cadastrado.");
        }

        // Funcionário
        System.out.println("Selecione o funcionário que fez o atendimento: ");
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.printf("%d - %s (%s)\n", i + 1,
                    funcionarios.get(i).getNome(),
                    funcionarios.get(i).getCargo());
        }
        System.out.print("Digite o número do funcionário: ");
        int funcIndex = sc.nextInt();
        sc.nextLine();

        if (funcIndex > 0 && funcIndex <= funcionarios.size()) {
            pedido.setFuncionario(funcionarios.get(funcIndex - 1));
        } else {
            System.out.println("Funcionário inválido. Pedido sem funcionário associado.");
        }

        pedido.finalizar();
        pedidos.add(pedido);
    }

    public double totalVendasDoDia() {
        double total = 0;
        for (Pedido pedido : pedidos) {
            if (pedido.getDataPedido().equals(java.time.LocalDate.now())) {
                total += pedido.getTotal();
            }
        }
        return total;
    }

    public void mostrarTotalVendasDoDia() {
        double total = totalVendasDoDia();
        System.out.printf("Total de vendas do dia: R$ %.2f\n", total);
    }
}
