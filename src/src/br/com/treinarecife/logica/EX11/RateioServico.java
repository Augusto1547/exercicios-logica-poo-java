package br.com.treinarecife.logica.EX11;

public class RateioServico {

    public void calcularRateioApartamentos(Rateio rateio) {

        float calcular = (rateio.getValorDaContaDeAgua() + rateio.getValorContaDeEnergia()) /
                rateio.getQuantidadeApartamentos();

        System.out.printf("Valor do rateio: R$ %.2f por apartamento. ", calcular);

    }

}