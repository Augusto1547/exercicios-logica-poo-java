package br.com.treinarecife.logica.EX21;
/*
EX21 – Ordem Crescente
Faça um programa que leia do teclado três valores inteiros e exiba-os em
ordem crescente.

Para testar seu programa use os valores abaixo:

Entrada Saída
100 (v1)
30 (v2)
Ordem Crescente: 30 , 40, 100
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OrdemCrescente {

    /**
     * Modelo 1
     */
    public void imprimeCrescenteModeloUm(int valorUm, int valorDois, int valorTres) {

        List<Integer> valores = Arrays.asList(valorUm, valorDois, valorTres);

        Collections.sort(valores);

        System.out.println(valores);

    }

    /**
     * Modelo 2
     */
    public void imprimeCrescenteModeloDois(int valorUm, int valorDois, int valorTres) {

        List<Integer> numeros = Arrays.asList(valorUm, valorDois, valorTres);

        List<Integer> ordenados = numeros.stream()// coloca os números na "esteira"
                .sorted()// ordena em ordem crescente
                // .filter(n -> n % 2 == 0) // só deixa passar os pares
                .collect(Collectors.toList()); // junta numa lista

        System.out.println(ordenados); // saída: [1, 2, 3, 5, 9]

    }

    /**
     * Modelo 3
     */
    public void imprimeCrescenteModeloTres(int valorUm, int valorDois, int valorTres) {

        int[] valores = new int[] { valorUm, valorDois, valorTres };

        Arrays.sort(valores);

        System.out.println(Arrays.toString(valores));

    }

    public static void main(String[] args) {
        OrdemCrescente crescente = new OrdemCrescente();

        int[] numeros = { 205, 89, 33 };

        crescente.imprimeCrescenteModeloUm(100, 30,  40);
        crescente.imprimeCrescenteModeloDois(7,2,3);
        crescente.imprimeCrescenteModeloTres(300, 500, 18);
    }

}