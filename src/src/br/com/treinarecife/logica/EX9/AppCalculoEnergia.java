package br.com.treinarecife.logica.EX9;

import java.util.Scanner;

public class AppCalculoEnergia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o salário mínimo");
        double salario = sc.nextDouble();

        System.out.println("Informe o valor do quilowatt consumido no mês");
        int quilowatt = sc.nextInt();
        System.out.printf("%n");

        ContaDeEnergia conta = new ContaDeEnergia(salario, quilowatt);

        System.out.println("Valor kw " + " R$ " + conta.valorQuilowatt());
        System.out.printf("Valor da conta R$ %.2f %n",conta.valorConta());

        conta.valorContaDescontada();

        sc.close();
    }

}