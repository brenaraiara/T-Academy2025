package Projeto1_GestaoPadaria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class DadosIniciais {

    public static void inicializarDados(
            ArrayList<Cliente> clientes,
            ArrayList<Produto> produtos,
            ArrayList<Funcionario> funcionarios,
            Estoque estoque
    ) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Clientes
        clientes.add(new Cliente("Carlos Alberto", "12345678912", "47997520297", LocalDate.parse("14/10/2007", formatter)));
        clientes.add(new Cliente("Ana Julia", "98765432198", "47988776655", LocalDate.parse("15/08/2000", formatter)));
        clientes.add(new Cliente("Thiago Oliveira", "09878654378", "47988797654", LocalDate.parse("16/08/1998", formatter)));

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
        estoque.adicionarItem(p1, LocalDate.now(), LocalDate.now().plusDays(0));
        estoque.adicionarItem(p1, LocalDate.now(), LocalDate.now().plusDays(5));
        estoque.adicionarItem(p2, LocalDate.now(), LocalDate.now().plusDays(2));
        estoque.adicionarItem(p3, LocalDate.now(), LocalDate.now().plusDays(1));
        estoque.adicionarItem(p4, LocalDate.now(), LocalDate.now().plusDays(3));
        estoque.adicionarItem(p5, LocalDate.now(), LocalDate.now().plusDays(1));

        // Funcionários
        funcionarios.add(new Funcionario("Fernanda Maria", "019875698732", "47988764689", Funcionario.Cargos.GERENTE, LocalDate.parse("11/10/2007", formatter)));
        funcionarios.add(new Funcionario("Brena Raiara", "21398764590", "47856789098", Funcionario.Cargos.ATENDENTE, LocalDate.parse("03/02/1999", formatter)));
        funcionarios.add(new Funcionario("Rhuan Silva", "21209867509", "47988996654", Funcionario.Cargos.PADEIRO, LocalDate.parse("29/02/2010", formatter)));
        funcionarios.add(new Funcionario("Rannyer", "09835689765", "47988987654", Funcionario.Cargos.CAIXA, LocalDate.parse("14/08/1997", formatter)));
    }
}
