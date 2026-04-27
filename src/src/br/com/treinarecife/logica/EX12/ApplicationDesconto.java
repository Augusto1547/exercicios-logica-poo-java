package br.com.treinarecife.logica.EX12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ApplicationDesconto {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in);) {

            try {
                System.out.println("Valor do produto um");
                String valorUmStr = sc.next().replace(",", ".");
                double valorUm = Double.parseDouble(valorUmStr);

                System.out.println("Valor do produto dois");
                String valorDoisStr = sc.next().replace(",", ".");
                double valorDois = Double.parseDouble(valorDoisStr);

                System.out.println("Valor do produto três");
                String valorTresStr = sc.next().replace(",", ".");
                double valorTres = Double.parseDouble(valorTresStr);
                System.out.printf("%n");

                PromocaoDaLoja promocaoAmericanas = new PromocaoDaLoja(valorUm, valorDois, valorTres);
                promocaoAmericanas.calcularPromocao();

            } catch (InputMismatchException e) {

                System.out.print("Erro: só são aceitos valores numéricos com ou sem casas decimais");

            }  
        }
    }
}