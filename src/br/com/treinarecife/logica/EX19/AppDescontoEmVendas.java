package br.com.treinarecife.logica.EX19;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AppDescontoEmVendas {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in);) {

            try {
                System.out.println("Informe o valor da compra");
                sc.useLocale(Locale.US); // Agora aceita 835.00 ou 835 só não 835,00
                float valor = sc.nextFloat();

                DescontoEmVendas desconto = new DescontoEmVendas();
                desconto.verificarDesconto(valor);

            } catch (InputMismatchException e) {

                System.out.println("Erro: não aceitamos casas decimais com virgula, só com ponto ou sem. \n");
            }
        }
    }
}