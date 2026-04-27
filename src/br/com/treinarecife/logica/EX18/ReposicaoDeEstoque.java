package br.com.treinarecife.logica.EX18;

import java.util.*;

public class ReposicaoDeEstoque implements Estoque {

    @Override
    public void avaliarEstoque(String nomeProduto, int quantidadeEstoque) {
        Estoque.super.avaliarEstoque(nomeProduto, quantidadeEstoque);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual produto você deseja avaliar o estoque?");
        String produto = sc.nextLine();

        System.out.println("Qual é a quantidade do estoque atual?");
        int estoque = sc.nextInt();

        ReposicaoDeEstoque mercadinhoConfianca = new ReposicaoDeEstoque();
        mercadinhoConfianca.avaliarEstoque(produto, estoque);
        sc.close();
    }
}