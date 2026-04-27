package br.com.treinarecife.logica.EX19;

public class DescontoEmVendas {

    public float calculoDeDezPorcento() {

        float valorDeDezPorcento = 10f / 100f;
        return valorDeDezPorcento;
    }

    public void verificarDesconto(float valorTotalDaCompra) {

        if (valorTotalDaCompra > 500.00) {
            float valorDescontado = valorTotalDaCompra * calculoDeDezPorcento();
            float totalComDesconto = valorTotalDaCompra - valorDescontado;
            System.out.printf("Valor a Pagar: R$ %.2f%n ", totalComDesconto);
        } else {

            System.out.println("Item não tem desconto");
        }

    }
}