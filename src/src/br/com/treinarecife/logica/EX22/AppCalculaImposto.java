package br.com.treinarecife.logica.EX22;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AppCalculaImposto {

    public static void main(String[] args) {

        ImpostoCasal imposto = new ImpostoCasal();

        try (Scanner sc = new Scanner(System.in);) {

            try {

                while (true) {
                    System.out.println("Por favor, informe o nome do esposo");
                    String nomeMarido = sc.nextLine();
                    imposto.nomeDoMarido = nomeMarido;

                    System.out.println("Por favor, informe o nome da esposa");
                    String nomeEsposa = sc.nextLine();
                    imposto.nomeDaEsposa = nomeEsposa;

                    // Regex: aceita apenas letras (maiúsculas/minúsculas) e espaços
                    // Retribui equivalentemente
                    if (!nomeMarido.matches("[A-Za-zÀ-ÿ\\s]+") || !nomeEsposa.matches("[A-Za-zÀ-ÿ\\s]+")) {
                        System.out.println("Entrada inválida! Digite apenas letras.");
                        continue; // Volta ao início
                    } 

                    System.out.println("Por favor, informe o sário do mês do esposo");
                    sc.useLocale(Locale.US);
                    String salarioDoMesEsposoStr = sc.next().replace(",", ".");
                    double salarioDoMesEsposo = Double.parseDouble(salarioDoMesEsposoStr);

                    System.out.println("Por favor, informe o bonus do mês do esposo");
                    String bonusDoMesEsposoStr = sc.next().replace(",", ".");
                    double bonusDoMesEsposo = Double.parseDouble(bonusDoMesEsposoStr);

                    System.out.println("Por favor, informe o sário do mês da esposa");
                    String salarioDoMesEsposaStr = sc.next().replace(",", ".");
                    double salarioDoMesEsposa = Double.parseDouble(salarioDoMesEsposaStr);

                    System.out.println("Por favor, informe o bonus do mês da esposa");
                    String bonusDoMesEsposaStr = sc.next().replace(",", ".");
                    double bonusDoMesEsposa = Double.parseDouble(bonusDoMesEsposaStr);

                    imposto.rendaConjunta(salarioDoMesEsposo, bonusDoMesEsposo, salarioDoMesEsposa, bonusDoMesEsposa);

                }
            } catch (InputMismatchException e) {

                System.out.println("Erro: só aceitamos números inteiros com ou sem casas decimais.");
            }
        }

    }
}