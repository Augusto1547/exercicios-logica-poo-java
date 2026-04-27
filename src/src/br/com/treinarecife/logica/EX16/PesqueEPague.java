package br.com.treinarecife.logica.EX16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PesqueEPague {

    int pesoPadrao = 50;
    double valorMulta = 4.00;

    public void calcularExcessoPesoPeixes(int pesoDosPeixes) {

        if (pesoDosPeixes > 50) {

            int peso = pesoDosPeixes - this.pesoPadrao;
            System.out.println("Peso sem multa " + pesoPadrao + "Kg");
            System.out.println("O peso dos seus peixes excedeu em: " + peso + "Kg o peso sem multa.");
            System.out.printf("Multa a pagar R$: %.2f%n", peso * this.valorMulta);

        } else {

            System.out.println("Peso ok!");

        }

    }
     
   public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            try {
                PesqueEPague multa = new PesqueEPague();

                System.out.println("Informe o peso total da pesca.");
                int pesoTotal = sc.nextInt();
                multa.calcularExcessoPesoPeixes(pesoTotal);

            } catch (InputMismatchException e) {

                System.out.println("Erro: por favor, informe um número inteiro");
            }

        }

    }

}