package br.com.treinarecife.logica.EX15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppShowAoVivo {

    void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            try {

                System.out.println("Quanto é cobrado por hora de show?");
                double valorHoraShow = sc.nextDouble();
                System.out.println("Quantos kilômetros de deslocamento até o show?");
                double distanciakilometros = sc.nextDouble();
                System.out.println("Quantas horas terá o show?");
                int quantHorasShow = sc.nextInt();
                ShowAoVivo zezeDeCamargoELuciano = new ShowAoVivo(valorHoraShow, quantHorasShow, 50.00,
                        distanciakilometros);

                zezeDeCamargoELuciano.valorDoShow();
                zezeDeCamargoELuciano.valorDoFrete();

            } catch (InputMismatchException e) {

                System.out.println("Erro: só são aceitos valores numéricos com ou sem casas decimais.");
            }

        }

    }
}