package br.com.treinarecife.logica.EX10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Faça um programa para calcular e exibir o salário líquido de um
 * determinado funcionário. Sabe-se que será informado por intermédio do
 * teclado o salário fixo, as vantagens e os descontos. O salário líquido é
 * obtido somando-se as vantagens ao salário fixo e abatendo-se os
 * descontos.
 * Para testar seu programa use os valores abaixo:
 * Entrada Saída
 * 2000.00 (salarioFixo)
 * 1000.00 (vantagens)
 * 500.00 (descontos)
 * 
 * Salário Líquido: R$ 2500.00
 * 
 */

public class Funcionario {

    public static void exibirSalarioLiquido(double salarioFixo, double vantagens, double desvantagens) {

        double somaAoSalario = salarioFixo + vantagens;
        double salarioLiquido = somaAoSalario - desvantagens;

        System.out.printf("Salário Líquido após o acrescimo e desconto é R$ %.2f: ", salarioLiquido);

    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in);) {

            try {
                System.out.println("Informe o seu salário fixo atual");
                double salarioFixo = sc.nextDouble();

                System.out.println("Informe as vantagens obtidas");
                double vantagens = sc.nextDouble();

                System.out.println("Informe as desvantagens obtidas");
                double desvantagens = sc.nextDouble();

                exibirSalarioLiquido(salarioFixo, vantagens, desvantagens);

            } catch (InputMismatchException e) {

                System.out.println("Erro: so são aceitos valores numéricos com ou sem casas decimais");

            } catch (Exception e) {

                System.out.println("Erro: ocorreu um erro inesperado " + e.getMessage());
            }

        }
    }
}