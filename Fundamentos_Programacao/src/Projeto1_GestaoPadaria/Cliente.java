package Projeto1_GestaoPadaria;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
    private static int proximoCodigo = 1;
    private int codigo;
    private String nome;
    private String cpf;
    private String telefone;
    private LocalDate dataNascimento;
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public Cliente(String nome, String cpf, String telefone, LocalDate dataNascimento) {
        this.codigo = proximoCodigo++;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void adicionarPedido(Pedido p) {
        pedidos.add(p);
    }

    public LocalDate getDataNascimento() { return dataNascimento;}

    @Override
    public String toString() {
        return "Cód: " + codigo + " | Nome: " + nome + " | CPF: " + cpf + " | Telefone: " + telefone;
    }
}
