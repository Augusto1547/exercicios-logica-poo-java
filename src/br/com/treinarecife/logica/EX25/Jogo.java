package br.com.treinarecife.logica.EX25;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");

            LocalTime horaI = null;
            LocalTime horaF = null;

            // Entrada com validação
            while (horaI == null) {
                System.out.println("Informe a hora em que o jogo começou (HH:mm):");
                String horaInicial = sc.nextLine();
                try {
                    horaI = LocalTime.parse(horaInicial, formatter);
                } catch (DateTimeParseException e) {
                    System.out.println("Formato inválido! Digite novamente no formato HH:mm (ex: 21:30).");
                }
            }

            while (horaF == null) {
                System.out.println("Informe a hora em que o jogo terminou (HH:mm):");
                String horaFinal = sc.nextLine();
                try {
                    horaF = LocalTime.parse(horaFinal, formatter);
                } catch (DateTimeParseException e) {
                    System.out.println("Formato inválido! Digite novamente no formato HH:mm (ex: 23:45).");
                }
            }

            // Cálculo da duração
            long minutosTotais = java.time.temporal.ChronoUnit.MINUTES.between(horaI, horaF);
            if (minutosTotais < 0) {
                minutosTotais += 24 * 60; // Ajuste para jogos que passam da meia-noite
            }

            long horas = minutosTotais / 60;
            long minutos = minutosTotais % 60;

            System.out.printf("A duração do jogo foi de %d horas e %d minutos.%n", horas, minutos);
        }
    }
}
