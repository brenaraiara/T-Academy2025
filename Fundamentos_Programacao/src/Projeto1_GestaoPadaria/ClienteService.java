package Projeto1_GestaoPadaria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class ClienteService {

    private ArrayList<Cliente> clientes;
    private Scanner sc;

    public ClienteService(ArrayList<Cliente> clientesExistentes, Scanner sc) {
        this.clientes = clientesExistentes;
        this.sc = sc;
    }

    // Menu interno de clientes
    public void menuClientes() {
        System.out.println("\n---- GERIR CLIENTES ----");
        System.out.println("1 - Adicionar cliente");
        System.out.println("2 - Remover cliente");
        System.out.println("3 - Listar clientes");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();
        sc.nextLine(); // consumir o enter

        switch (opcao) {
            case 1 -> adicionarClienteMenu();
            case 2 -> removerClienteMenu();
            case 3 -> listarClientes();
            default -> System.out.println("Opção inválida!");
        }
    }

    // Adicionar cliente via menu
    private void adicionarClienteMenu() {
        System.out.print("Digite o nome do cliente: ");
        String nome = sc.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        String cpf = sc.nextLine();
        System.out.print("Digite o telefone do cliente: ");
        String telefone = sc.nextLine();

        System.out.println("Digite a data de nascimento (dd/MM/yyyy): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nascimento = LocalDate.parse(sc.nextLine(), formatter);
    }

    public void mostrarAniversariosHoje() {
        LocalDate hoje = LocalDate.now();
        boolean encontrouAniversariante = false;

        for (Cliente cliente : clientes) {
            if (cliente.getDataNascimento().getDayOfMonth() == hoje.getDayOfMonth() &&
                    cliente.getDataNascimento().getMonth() == hoje.getMonth()) {

                System.out.println("Hoje é aniversário do cliente " + cliente.getNome() + "!");
                encontrouAniversariante = true;
            }
        }

        if (!encontrouAniversariante) {
            System.out.println("Nenhum cliente faz aniversário hoje.");
        }
    }


    // Remover cliente via menu
    private void removerClienteMenu() {
        System.out.print("Digite o CPF do cliente a ser removido: ");
        String cpf = sc.nextLine();
        removerCliente(cpf);
    };

    // Adicionar cliente diretamente
    public void adicionarCliente(String nome, String cpf, String telefone, LocalDate nascimento) {
        Cliente novoCliente = new Cliente(nome, cpf, telefone, nascimento);
        clientes.add(novoCliente);
        System.out.println("Cliente adicionado com sucesso: " + novoCliente);
    }

    // Remover cliente pelo CPF
    public void removerCliente(String cpf) {
        Cliente clienteParaRemover = null;
        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpf)) {
                clienteParaRemover = c;
                break;
            }
        }
        if (clienteParaRemover != null) {
            clientes.remove(clienteParaRemover);
            System.out.println("Cliente removido com sucesso: " + clienteParaRemover.getNome());
        } else {
            System.out.println("Cliente com CPF " + cpf + " não encontrado.");
        }
    }

    // Listar todos os clientes
    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        System.out.println("---- LISTA DE CLIENTES ----");
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

    // Buscar cliente pelo CPF
    public Cliente buscarClientePorCpf(String cpf) {
        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpf)) {
                return c;
            }
        }
        return null;
    }

    // Getter da lista de clientes
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}
