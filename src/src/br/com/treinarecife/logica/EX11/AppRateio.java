package br.com.treinarecife.logica.EX11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppRateio {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in);) {

            try {
                System.out.println("Informe a quantidade de apartamentos:");
                int quantidadeApartamentos = sc.nextInt();

                System.out.println("Informe o valor da conta de energia:");
                String energiaStr = sc.next().replace(",", ".");
                float contaEnergia = Float.parseFloat(energiaStr);

                System.out.println("Informe o valor da conta de água:");
                String aguaStr = sc.next().replace(",", ".");
                float contaAgua = Float.parseFloat(aguaStr);


                Rateio rateio = new Rateio(quantidadeApartamentos, contaEnergia, contaAgua);
                RateioServico rateioServico = new RateioServico();

                rateioServico.calcularRateioApartamentos(rateio);

            } catch (InputMismatchException e) {

                System.out.println("Erro: só são aceitos valores numéricos com ou sem casas decimais");

            }  
        }
    }
}