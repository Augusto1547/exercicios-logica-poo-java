package br.com.treinarecife.logica.EX20;

import java.util.*;

/*1:50
EX20 – Maior de Três
Faça um programa que leia do teclado três valores inteiros e exiba o maior
e menor entre eles.
Para testar seu programa use os valores abaixo:
Entrada Saída
100 (v1)
30 (v2)
40 (v3)

O Maior é: 100
O Menor é: 30

2 (v1)
3 (v2)
17 (v3)

O Maior é: 17
O Menor é: 2

300 (v1)
500 (v2)
18 (v3)

O Maior é: 500
O Menor é: 18
 */
public class MaiorDeTres {

    public void comparaValores(int numeroUm, int numeroDois, int numeroTres) {

        int[] numeros = { numeroUm, numeroDois, numeroTres };

        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }

        }
        System.out.println("O maior é: " + maior);
        System.out.println("O menor é: " + menor);
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            try {
                System.out.println("Informe um número inteiro qualquer");
                int primeiroNumero = sc.nextInt();

                System.out.println("Informe o segundo inteiro");
                int segundoNumero = sc.nextInt();

                System.out.println("Infome o terceiro inteiro");
                int terceiroNumero = sc.nextInt();

                MaiorDeTres m = new MaiorDeTres();

                m.comparaValores(primeiroNumero, segundoNumero, terceiroNumero);

            } catch (InputMismatchException e) {

                System.out.println("Erro: digite um número inteiro. ");

            }
        }
    }
}
