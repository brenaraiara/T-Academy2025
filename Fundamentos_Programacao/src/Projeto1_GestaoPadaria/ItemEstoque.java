package Projeto1_GestaoPadaria;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class ItemEstoque {
    private Produto produto;
    private LocalDate dataProducao;
    private LocalDate dataValidade;

    ItemEstoque(Produto produto, LocalDate dataProducao, LocalDate dataValidade) {
        this.produto = produto;
        this.dataProducao = dataProducao;
        this.dataValidade = dataValidade;
    }

    public boolean estaProximoVencimento() {
        return java.time.Period.between(LocalDate.now(), dataValidade).getDays() <= 2;
    }

    public String getNome() {
        return produto.getNome();
    }

    public double getPreco() {
        return produto.getPreco();
    }

    public Produto getProduto() {
        return produto;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public double getPrecoComDesconto(boolean isCliente) {
        double precoBase = produto.getPreco();
        double descontoVencimento = estaProximoVencimento() ? 0.3 : 0.0; //30% de desconto, valido para todos
        double descontoCliente = isCliente ? 0.2 : 0.0; // 20% de desconto se o cliente for fidelizado

        double descontoTotal = descontoVencimento + descontoCliente;
        descontoTotal = Math.min(descontoTotal, 1.0);

        return precoBase * (1 - descontoTotal);
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String statusVencimento = estaProximoVencimento() ? " [PRÓXIMO AO VENCIMENTO]" : "";
        return produto.toString() + " | Produção: " + dataProducao.format(dtf) + " | Validade: " + dataValidade.format(dtf) + statusVencimento;
    }
}
