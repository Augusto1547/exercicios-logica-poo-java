package br.com.treinarecife.logica.EX12;
/*
Uma loja oferece uma promoção: na compra de 3 produtos, o terceiro é
50% mais barato. Faça um programa que leia o preço de 3 produtos e
calcule o valor total considerando a promoção.
Para testar seu programa use os valores abaixo:
Entrada:
100.00 (produto1)
90,00 (produto2)
110.00 (produto3)

Saída: Valor da Compra: R$ 245.00
 */

class PromocaoDaLoja implements Desconto {

   private double valorProdutoUm;
   private double valorProdutoDois;
   private double valorProdutoTres;

    public PromocaoDaLoja(double valorProdutoUm, double valorProdutoDois, double valorProdutoTres) {

        if (valorProdutoUm > 0 && valorProdutoDois > 0 && valorProdutoTres > 0) {
            this.valorProdutoUm = valorProdutoUm;
            this.valorProdutoDois = valorProdutoDois;
            this.valorProdutoTres = valorProdutoTres;
        } else {
            throw new IllegalArgumentException("Só é aceito valores maiores que 0");
        }
    }

    @Override
    public void calcularPromocao() {

        double valorSemDesconto = (this.valorProdutoUm + this.valorProdutoDois + this.valorProdutoTres);
        double valorComDesconto = (this.valorProdutoUm + this.valorProdutoDois) + this.valorProdutoTres * 0.5;
        System.out.printf("De R$ %.2f para R$ %.2f desconto de 50%% ao ultimo produto fornecido", valorSemDesconto,
                valorComDesconto);

    }

}