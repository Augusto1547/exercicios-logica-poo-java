package br.com.treinarecife.logica.EX26;

import java.util.Scanner;

public class DefinicaoAnimal {

  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Escolha uma das opções: Vertebrado ou Invertebrado.");
      String dadosAnimalUm = sc.nextLine();

      System.out.println("Se escolheu Vertebrado, digite agora: Ave ou Mamífero. "
          + "Se escolheu Invertebrado, digite agora: Inseto ou Anelídeo.");
      String dadosAnimalDois = sc.nextLine();

      System.out.println("Se escolheu Ave, digite agora: Carnívoro ou Onívoro. "
          + "Se escolheu Mamífero, digite agora: Onívoro ou Herbívoro. "
          + "Se escolheu Inseto, digite agora: Hematofago ou Herbívoro. "
          + "Se escolheu Anelídeo, digite agora: Hematofago ou Onívoro.");
      String dadosAnimalTres = sc.nextLine();
      if (dadosAnimalUm.equalsIgnoreCase("Vertebrado")
          && dadosAnimalDois.equalsIgnoreCase("Ave") &&
          dadosAnimalTres.equalsIgnoreCase("Carnívoro")) {
        System.out.println("O animal é: Águia.");

      } else if (dadosAnimalUm.equalsIgnoreCase("Vertebrado")
          && dadosAnimalDois.equalsIgnoreCase("Ave") &&
          dadosAnimalTres.equalsIgnoreCase("Onívoro")) {
        System.out.println("O animal é: Pomba.");

      } else if (dadosAnimalUm.equalsIgnoreCase("Vertebrado")
          && dadosAnimalDois.equalsIgnoreCase("Mamífero") &&
          dadosAnimalTres.equalsIgnoreCase("Onívoro")) {
        System.out.println("O animal é: Homem.");

      } else if (dadosAnimalUm.equalsIgnoreCase("Vertebrado")
          && dadosAnimalDois.equalsIgnoreCase("Mamífero") &&
          dadosAnimalTres.equalsIgnoreCase("Herbívoro")) {
        System.out.println("O animal é: Vaca");

      } else if (dadosAnimalUm.equalsIgnoreCase("Invertebrado")
          && dadosAnimalDois.equalsIgnoreCase("Inseto") &&
          dadosAnimalTres.equalsIgnoreCase("Hematofago")) {
        System.out.println("O animal é: Pulga");

      } else if (dadosAnimalUm.equalsIgnoreCase("Invertebrado")
          && dadosAnimalDois.equalsIgnoreCase("Inseto") &&
          dadosAnimalTres.equalsIgnoreCase("Herbívoro")) {
        System.out.println("O animal é: Largata");

      } else if (dadosAnimalUm.equalsIgnoreCase("Invertebrado")
          && dadosAnimalDois.equalsIgnoreCase("Anelídeo") &&
          dadosAnimalTres.equalsIgnoreCase("Hematofago")) {
        System.out.println("O animal é: Sanguessuga");

      } else if (dadosAnimalUm.equalsIgnoreCase("Invertebrado")
          && dadosAnimalDois.equalsIgnoreCase("Anelídeo") &&
          dadosAnimalTres.equalsIgnoreCase("Onívoro")) {
        System.out.println("O animal é: Minhoca");

      }
    }
  }
}