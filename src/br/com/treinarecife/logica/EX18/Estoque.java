package br.com.treinarecife.logica.EX18;

import java.text.Normalizer;

public interface Estoque {

    // Método auxiliar para remover acentos
    static String removerAcentos(String texto) {
        return Normalizer.normalize(texto, Normalizer.Form.NFD)
                         .replaceAll("\\p{M}", "");
    }

    default void avaliarEstoque(String nomeProduto, int quantidadeEstoque) {

        // Normaliza o nome do produto (remove acentos)
        String nomeNormalizado = removerAcentos(nomeProduto);

        if (!(nomeNormalizado.equalsIgnoreCase("Cafe") ||
              nomeNormalizado.equalsIgnoreCase("Pao") ||
              nomeNormalizado.equalsIgnoreCase("Azeite"))) {

            System.out.println("Só aceitamos os produtos: Café, Pão ou Azeite");

        } else if (quantidadeEstoque < 10) {

            System.out.println("Produto em Falta! Deve ser reabastecido");

        } else {

            System.out.println("Produto suficiente");
        }
    }
}