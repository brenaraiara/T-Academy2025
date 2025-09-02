package Exercicios_Aula4;

import java.time.LocalDate;
import java.util.Scanner;

public class Consulta_Medica {
    private static final int NAO = 0;
    private static final int SIM = 1;

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("===CADASTRO DE PACIENTE===");
            System.out.print("Nome: ");
            String nome = scan.nextLine();
            System.out.print("Idade: ");
            int idade = scan.nextInt();
            System.out.print("Altura (em metros): ");
            double altura = scan.nextDouble();
            System.out.print("Peso (em quilos): ");
            double peso = scan.nextDouble();
            System.out.print("Sexo ('M': Masculino - 'F': Feminino): ");
            String sexo = scan.next();

            //Tpos de atendimento
            System.out.println("\nTipo de atendimento: ");
            System.out.println("1- Plano de saúde");
            System.out.println("2- Partiuclar");
            int tipo = scan.nextInt();
            scan.nextLine();
            String numeroCarteirinha = "";
            String tipoAtendimento;

            if (tipo == 1) {
                tipoAtendimento = "Plano de saúde";
                System.out.println("Informe o número da carteirinha: ");
                numeroCarteirinha = scan.nextLine();
            } else {
                tipoAtendimento = "Particular";
            }

            Paciente p1 = new Paciente(nome, idade, altura, peso, sexo, tipoAtendimento, numeroCarteirinha);

            // Dados do paciente
            System.out.println(p1);
            System.out.println(p1.calcularImc());

            // Iniciar consulta
            menu();
            int soma = 0;
            soma += perguntarSintomas(scan, "Está com febre?");
            soma += perguntarSintomas(scan, "Está com dor de garganta?");
            soma += perguntarSintomas(scan, "Está com dor no corpo?");
            soma += perguntarSintomas(scan, "Está com tosse?");
            soma += perguntarSintomas(scan, "Está com dificuldade de respirar?");

            // Diagnóstico
            if (soma == 0) System.out.println("Inconclusivo");
            else if (soma < 3) {
                System.out.println("Indicação: Precisa fazer exames");
                marcarExames(scan);
            } else {
                System.out.println("Diagnóstico: Gripe");
                receitarRemedio(scan);
            }
        }
    }

    public static int perguntarSintomas(Scanner scan, String pergunta) {
        System.out.println(pergunta + " ");
        int resposta;
        do {
            resposta = scan.nextInt();
            if (resposta != NAO && resposta != SIM) {
                System.out.println("Digite apenas 0 (Não) ou 1 (Sim): ");
            }
        } while (resposta != NAO && resposta != SIM);
        return resposta;
    }

    public static void marcarExames(Scanner scan) {
        LocalDate hoje = LocalDate.now();
        System.out.println("\nEscolha um dia: ");
        for (int i = 1; i < 3; i++) {
            System.out.println(i + "- " + hoje.plusDays(i));
        }
        int dia = scan.nextInt();
        if (dia >= 1 && dia <= 3) {
            System.out.println("Exame marcado para o dia " + hoje.plusDays(dia));
        } else {
            System.out.println("Opção inválida!");
        }
    }

    public static void receitarRemedio(Scanner scan) {
        menu();
        if (perguntarSintomas(scan, "Tem alergia a Paracetamol?") == NAO) {
            System.out.println("Receita: Paracetamol 500mg; 2x ao dia");
            return;
        }
        if (perguntarSintomas(scan, "Tem alergia a Dipirona?") == NAO) {
            System.out.println("Receita: Dipirona 1g; 2x ao dia");
            return;
        }
        System.out.println("Receita: Ibuprofeno 1g; 2x ao dia");
    }

    public static void menu() {
        System.out.println("\nResponda: ");
        System.out.println("0 - Não");
        System.out.println("1 - Sim");
    }
}

class Paciente {

    public String nome;
    public int idade;
    public double altura;
    public double peso;
    public String sexo;
    public String tipoAtendimento;
    public String numeroCarteirinha;

    public Paciente(String nome, int idade, double altura, double peso, String sexo, String tipoAtendimento, String numeroCarteirinha) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        this.tipoAtendimento = tipoAtendimento;
        this.numeroCarteirinha = numeroCarteirinha;
    }

    @Override
    public String toString() {
        String s = "";
        s += "\nDados do paciente";
        s += "\nNome: " + nome;
        s += "\nIdade: " + idade + " ano(s)";
        s += "\nPeso: " + peso + "kg";
        s += "\nAltura: " + altura + "m";
        s += "\nSexo: " + sexo;
        s += "\nTipo de atendimento: " + tipoAtendimento;
        if (!numeroCarteirinha.isEmpty()) {
            s += "\ncarteirinha: " + numeroCarteirinha;
        }
        return s;
    }

    public String calcularImc() {
        double imc = this.peso / (this.altura * this.altura);
        String s = "IMC: " + String.format("%.2f", imc) + "kg/m² - ";
        if (imc < 18.5)
            s += "Peso Insuficiente";
        else if (imc < 24.9)
            s += "Normal";
        else if (imc < 30)
            s += "Sobrepeso";
        else
            s += "Obesidade";
        return s;
    }
}
