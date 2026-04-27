package br.com.treinarecife.logica.EX7;

import java.util.Scanner;

public class AplicacaoSalario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o salário base do funcionario.");
        double salario = sc.nextDouble();

        System.out.println("Quanto ele vendeu em reais nesse mês.");
        double totalVendas = sc.nextDouble();
        Funcionario funcionarioUm = new Funcionario(salario, totalVendas);

        funcionarioUm.salarioMaisComissao();

        sc.close();
    }
}