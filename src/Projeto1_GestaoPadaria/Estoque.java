package Projeto1_GestaoPadaria;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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

    // Remoção silenciosa (para pedidos)
    public void removerItemPeloIndice(int index) {
        if (index >= 0 && index < itens.size()) {
            itens.remove(index);
        }
    }

    // Remoção com mensagem (para menu)
    public void removerItemPeloIndiceComMensagem(int index) {
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

    public void mostrarAlertaDeValidade(){
        System.out.println("--------ALERTA DE VALIDADE--------");
        LocalDate hoje = LocalDate.now();
        boolean encontrou = false;

        for (ItemEstoque item : itens){
            long diasParaVencer = ChronoUnit.DAYS.between(hoje, item.getDataValidade());
            if (diasParaVencer<0){
                System.out.println(item.getNome()+" já venceu em "+ item.getDataValidade());
                encontrou=true;
            } else if (diasParaVencer<=3){
                System.out.println(item.getNome()+ " vai vencer em "+diasParaVencer+ " dias ("+item.getDataValidade()+ ")");
            }
        }
        if (!encontrou){
            System.out.println("Nenhum produto próximo da validade.");
        }
    }

    public void mostrarAlertaDeValidadeHoje() {
        System.out.println("---- ALERTA DE VALIDADE (HOJE) ----");
        LocalDate hoje = LocalDate.now();
        boolean encontrou = false;

        for (ItemEstoque item : itens) {
            if (item.getDataValidade().isEqual(hoje)) {
                System.out.println(item.getNome() + " vence hoje (" + item.getDataValidade() + ")");
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum produto vence hoje.");
        }
    }

}
