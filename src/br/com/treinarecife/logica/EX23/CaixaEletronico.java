package br.com.treinarecife.logica.EX23;

public class CaixaEletronico {

    public static void main(String[] args) {

        int numero = 576;

        if (numero > 99) {

            int centena = numero / 100;
            System.out.println(centena + " notas de R$ 100,00");

            int separarDezena = numero % 100;
            int cinquenta = 50;
            System.out.println("1 nota de R$ " + cinquenta);

            int sobras = separarDezena - cinquenta;

            if (sobras > 20) {

                sobras -= 20;
                System.out.println("1 nota de R$ 20,00");

            } else {

                System.out.println("0 notas de R$ 20,00");

            }
            if (sobras > 10) {

                sobras -= 10;
                System.out.println("1 nota de R$ 10,00");
            } else {

                System.out.println("0 notas de R$ 10,00");
            }
            if (sobras > 5) {

                sobras -= 5;
                System.out.println("1 nota de R$ 5,00");

            } else {

                System.out.println("0 notas de R$ 5,00");
            }
            if (sobras > 1 && sobras < 4) {

                sobras -= 2;
                System.out.println("1 nota de R$ 2,00");

            } else {

                System.out.println("0 notas de R$ 2,00");

            }
            if (sobras == 1) {

                System.out.println("1 nota de R$ 1,00");

            } else {

                System.out.println("0 notas de R$ 1,00");
            }

        } else {

            System.out.println("Por favor, digite uma valor acima de 100");

        }

    }

}
