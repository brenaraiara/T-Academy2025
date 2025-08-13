package Projeto1_GestaoPadaria;

import java.time.LocalDate;
import java.util.ArrayList;

public class DadosIniciais {

    public static void inicializarDados(
            ArrayList<Cliente> clientes,
            ArrayList<Produto> produtos,
            ArrayList<Funcionario> funcionarios,
            Estoque estoque
    ) {
        // Clientes
        clientes.add(new Cliente("Carlos Alberto", "12345678912", "47997520297"));
        clientes.add(new Cliente("Ana Julia", "98765432198", "47988776655"));

        // Produtos
        Produto p1 = new Produto("Bolo de Chocolate", 25.00);
        Produto p2 = new Produto("Bolo de Laranja", 22.50);
        Produto p3 = new Produto("Cuca de Banana", 30.00);
        Produto p4 = new Produto("Suco de Laranja", 10.00);
        Produto p5 = new Produto("Cafezinho", 5.00);

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        produtos.add(p5);

        // Estoque
        estoque.adicionarItem(p1, LocalDate.now(), LocalDate.now().plusDays(5));
        estoque.adicionarItem(p1, LocalDate.now(), LocalDate.now().plusDays(5));
        estoque.adicionarItem(p2, LocalDate.now(), LocalDate.now().plusDays(2));
        estoque.adicionarItem(p3, LocalDate.now(), LocalDate.now().plusDays(1));
        estoque.adicionarItem(p4, LocalDate.now(), LocalDate.now().plusDays(3));
        estoque.adicionarItem(p5, LocalDate.now(), LocalDate.now().plusDays(1));

        // Funcionários
        funcionarios.add(new Funcionario("Fernanda Maria", "019875698732", "47988764689", Funcionario.Cargos.GERENTE));
        funcionarios.add(new Funcionario("Brena Raiara", "21398764590", "47856789098", Funcionario.Cargos.ATENDENTE));
        funcionarios.add(new Funcionario("Rhuan Silva", "21209867509", "47988996654", Funcionario.Cargos.PADEIRO));
        funcionarios.add(new Funcionario("Rannyer", "09835689765", "47988987654", Funcionario.Cargos.CAIXA));
    }
}
