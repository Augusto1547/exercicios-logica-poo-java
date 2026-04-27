package br.com.treinarecife.logica.EX15;
/*
EX15 – Show ao Vivo
A empresa Show Life apresenta show ao vivo em qualquer local que for
solicitado. Cada show é cobrado por hora de apresentação mais um valor
cobrado pelo deslocamento de R$ 50.00 por quilometro conforme a
distância. A Show Life paga ao veículo, que faz o transporte dos
equipamentos e de pessoal, um frete de 35% sobre o valor cobrado pela
distância calculado anteriormente. Elabore um programa que receba via
teclado distância em quilometro , o valor em reais de cada hora da banda e
a duração em horas do show. Ao final calcular e exibir o valor do show e o
valor do frete a ser pago ao transportador.
Para testar seu programa use os valores abaixo:
Entrada Saída
1000.00 (valorHora)
50 (distanciakm))
3 (qtdHoras)

Valor do Show: R$ 5500.00
Valor do Frete: R$ 875.00

2000.00 (valorHora)
70 (distanciakm))
4 (qtdHhoras)

Valor do Show: R$ 11500.00
Valor do Frete: R$ 1225.00
*/

public class ShowAoVivo {

    public Double valorHora;
    public Integer quantidadeDeHoras; 
    public Double valorDeslocamento;
    public Double distanciaPercorrida; 

    public ShowAoVivo(Double valorHora, Double distanciaPercorrida, Integer quantidadeDeHoras) {

        this.valorHora = valorHora;
        this.distanciaPercorrida = distanciaPercorrida;
        this.quantidadeDeHoras = quantidadeDeHoras;
    }

    public ShowAoVivo(Double valorHora, Integer quantidadeDeHoras, Double valorDeslocamento,
            Double distanciaPercorrida) {
        this.valorHora = valorHora;
        this.quantidadeDeHoras = quantidadeDeHoras;
        this.valorDeslocamento = valorDeslocamento;
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public void valorDoShow() {
        Double valorShowCobrado = (this.valorHora * this.quantidadeDeHoras)
                + (this.valorDeslocamento * this.distanciaPercorrida);
        System.out.printf("Valor do Show: R$ %.2f  %n", valorShowCobrado);
    }

    public void valorDoFrete() {

        Double valorFreteCobrado = this.valorDeslocamento * this.distanciaPercorrida * 0.35;
        System.out.printf("Valor do frete: R$ %.2f  %n", valorFreteCobrado);
    }

}