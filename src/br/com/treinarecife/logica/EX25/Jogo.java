package br.com.treinarecife.logica.EX25;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Jogo {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Informe a hora inicial no formato: HH:mm");
    String horaInicial = sc.nextLine();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
    LocalTime hora = LocalTime.parse(horaInicial, formatter);
    System.out.println(hora);

    
    sc.close();

  }
}