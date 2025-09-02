package Projeto1_GestaoPadaria;

import java.time.LocalDate;
import java.util.ArrayList;

public class Funcionario {

    public enum Cargos {
        PADEIRO, ATENDENTE, CAIXA, GERENTE
    }

    private String nome;
    private String cpf;
    private String telefone;
    private Cargos cargo;
    private LocalDate dataNascimento;

    public Funcionario(String nome, String cpf, String telefone, Cargos cargo, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cargo = cargo;
        this.dataNascimento = dataNascimento;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public Cargos getCargo() {
        return cargo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCargo(Cargos cargo) {
        this.cargo = cargo;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return String.format(
                "Funcionário: %s\nCPF: %s\nTelefone: %\nCargo: %s"
                , nome, cpf, telefone, cargo
        );
    }

    public static void mostrarAniversariantesHoje(ArrayList<Funcionario> funcionarios) {
        LocalDate hoje = LocalDate.now();
        boolean encontrou = false;

        for (Funcionario f : funcionarios) {
            if (f.getDataNascimento() != null &&
                    f.getDataNascimento().getDayOfMonth() == hoje.getDayOfMonth() &&
                    f.getDataNascimento().getMonth() == hoje.getMonth()) {

                System.out.println("Hoje é aniversário do funcionário: " + f.getNome());
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum funcionário faz aniversário hoje.");
        }
    }
}








