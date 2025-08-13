package Projeto1_GestaoPadaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Estoque {

    private ArrayList<ItemEstoque> itens; // itens agora privados

    public Estoque() {
        this.itens = new ArrayList<>();
    }

    public List<ItemEstoque> getItens() {
        return itens; // getter para permitir acesso seguro
    }

    public void adicionarItem(Produto produto, LocalDate dataProducao, LocalDate dataValidade) {
        ItemEstoque item = new ItemEstoque(produto, dataProducao, dataValidade);
        itens.add(item);
    }

    public void removerProduto(ItemEstoque item) {
        itens.remove(item);
    }

    public void removerItemPeloIndice(int index) {
        if (index >= 0 && index < itens.size()) {
            itens.remove(index);
            System.out.println("Item removido com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void listarItens() {
        System.out.println("---- ITENS NO ESTOQUE ----");
        if (itens.isEmpty()) {
            System.out.println("O estoque está vazio.");
            return;
        }
        for (ItemEstoque item : itens) {
            System.out.println(item);
        }
    }

    public void listarItensComIndice() {
        if (itens.isEmpty()) {
            System.out.println("O estoque está vazio.");
            return;
        }
        System.out.println("\n---- ITENS NO ESTOQUE ----");
        for (int i = 0; i < itens.size(); i++) {
            System.out.println((i + 1) + ": " + itens.get(i));
        }
    }

    public void listarItensValidade() {
        System.out.println("---- ITENS NO ESTOQUE ORDENADO POR VALIDADE ----");
        ArrayList<ItemEstoque> ordenados = new ArrayList<>(itens);
        ordenados.sort(Comparator.comparing(ItemEstoque::getDataValidade));
        for (ItemEstoque i : ordenados) {
            System.out.println(i);
        }
    }
}
