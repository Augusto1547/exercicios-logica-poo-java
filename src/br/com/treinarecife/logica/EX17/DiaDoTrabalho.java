package br.com.treinarecife.logica.EX17;

import java.util.Arrays;
import java.util.Scanner;

public class DiaDoTrabalho {

    public static final double DEZ_PORCENTO = 10.0 / 100.0;
    public static final double SETE_PORCENTO = 7.0 / 100.0;
    public static final double CINCO_PORCENTO = 5.0 / 100.0;

    public static void aumentoSalarial(String nomeFuncionario, double salario) {

        double novoSalario;

        if (salario < 1100.00) {
            novoSalario = salario * DEZ_PORCENTO + salario;
            System.out.printf("Novo Salário de %s é: R$ %.2f%n ", nomeFuncionario, novoSalario);

        } else if (salario >= 1100.00 && salario <= 2000.00) {

            novoSalario = salario * SETE_PORCENTO + salario;
            System.out.printf("Novo Salário de %s é : R$ %.2f%n", nomeFuncionario, novoSalario);

        } else {

            novoSalario = salario * CINCO_PORCENTO + salario;
            System.out.printf("Novo Salário de %s é : R$ %.2f%n", nomeFuncionario, novoSalario);
        }

    }

    public static void main(String[] args) {

        String[] nomesFuncionarios = { "Roberto", "Natália", "Fernando", "Pedro" };

        try (Scanner sc = new Scanner(System.in)) {

            try {
                System.out.println("Informe o nome do funcionário.");
                String nome = sc.nextLine();

                // Verifica se o nome está no array
                if (!Arrays.asList(nomesFuncionarios).contains(nome)) {
                    System.out.println("Erro: nome inválido. Escolha um dos nomes da lista: "
                            + Arrays.toString(nomesFuncionarios));
                    return; // encerra o programa ou poderia pedir novamente
                }

                System.out.println("Informe o salário dele.");
                String salarioStr = sc.next().replace(",", ".");
                double salario = Double.parseDouble(salarioStr);

                DiaDoTrabalho.aumentoSalarial(nome, salario);

            } catch (NumberFormatException e) {

                System.out.println(
                        "Erro: Use apenas números para o salário. Não utilize letras ou caracteres especiais.");
            }

        }
    }
}