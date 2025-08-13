package Projeto1_GestaoPadaria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;
    private ArrayList<ItemEstoque> itens;
    private double total;
    private LocalDate dataPedido;

    private Funcionario funcionario;

    public Pedido() {
        this.itens = new ArrayList<>();
        this.total = 0;
        this.dataPedido = LocalDate.now();
    }

    public void adicionarItem(ItemEstoque item) {
        this.itens.add(item);
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void finalizar() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("================== Bug's Bakery ==================");
        System.out.println("Pedido emitido em: " + dataPedido.format(dtf));
        System.out.println("--------------------------------------------------");

        if (itens.isEmpty()) {
            System.out.println("O pedido está vazio!");
            return;
        }

        boolean isCliente = (this.cliente != null);

        // Cabeçalho da tabela
        System.out.printf("%-20s | %-13s | %-10s\n", "Item", "Valor Original", "Valor Pago");
        System.out.println("--------------------------------------------------");

        for (ItemEstoque item : itens) {
            double precoOriginal = item.getPreco();
            double precoPago = item.getPrecoComDesconto(isCliente);

            System.out.printf("%-20s | R$ %-10.2f | R$ %-10.2f\n",
                    item.getNome(),
                    precoOriginal,
                    precoPago);
        }

        calcularTotal();
        System.out.println("--------------------------------------------------");
        System.out.printf("Valor total: R$ %.2f\n", this.total);

        if (funcionario != null) {
            System.out.println("Atendimento feito por: " + funcionario.getNome());
        }

        if (cliente != null) {
            System.out.println("Cliente: " + cliente.getNome());
        }

        System.out.println("Volte sempre!");
        System.out.println("--------------------------------------------------");
    }

    public void calcularTotal() {
        total = 0;
        boolean isCliente = (this.cliente != null);
        for (ItemEstoque item : itens) {
            total += item.getPrecoComDesconto(isCliente);
        }
    }

    public void imprimirItens() {
        for (ItemEstoque item : itens) {
            System.out.println(item.getNome() + "   |   R$" + item.getPreco());
        }
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public double getTotal() {
        return total;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
