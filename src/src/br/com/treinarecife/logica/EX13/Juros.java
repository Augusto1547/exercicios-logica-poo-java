package br.com.treinarecife.logica.EX13;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Cálculo Juros Simples
Uma instituição financeira oferece um empréstimo com juros simples de 5% ao
mês. Faça um programa que leia o valor do empréstimo e o número de meses, e
calcule o total a ser pago.

Valor_DosJuros = Valor_DoEmprestimo ∗ PercentualDejuros / 100 ∗ QTd_Demeses


Para testar seu programa use os valores abaixo:
Entrada Saída
5000.00 (valorEmprestimo)
6 (qtdMeses)

Total a ser Pago: 6500.00

9877.32 (valorEmprestimo)
12 (qtdMeses)

Total a ser Pago: 15803.71
 */

public class Juros {

    public static String calcularJurosSimples(float valorDoEmprestimo, int quantMesesParaPagar) {

        if (valorDoEmprestimo > 0 && quantMesesParaPagar >= 1 && quantMesesParaPagar <= 12) {

            float recebeJurosSimples = valorDoEmprestimo * (5f / 100f) * quantMesesParaPagar;
            float totalAPagar = valorDoEmprestimo + recebeJurosSimples;
            DecimalFormat formato = new DecimalFormat("0.00");
            return formato.format(totalAPagar);

        } else {

            throw new IllegalArgumentException("parâmetros errados");
        }

    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in);) {

            try {

                System.out.println("Qual será o valor do empréstimo?");
                String valorEmprestimoStr = sc.next().replace(",", ".");
                float valorDoEmprestimo = Float.parseFloat(valorEmprestimoStr);
                
                System.out.println("Em quantos meses deseja pagar?");
                String quantMesesParaPagarStr = sc.next().replace(",", ".");
                int quantMesesParaPagar = Integer.parseInt(quantMesesParaPagarStr);

                System.out.println("Total a ser pago: R$ " + calcularJurosSimples(valorDoEmprestimo, quantMesesParaPagar));

            } catch (NumberFormatException e) {

                System.out.println("Erro: a string não é um número válido");

            }
        }
    }
}