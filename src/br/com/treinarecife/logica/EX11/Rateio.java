package br.com.treinarecife.logica.EX11;

/*
A energia da área comum e a água consumida pelos moradores do Edifício
Prata Nobre é rateado entre os apartamentos. Escreva um programa que
receba a quantidade de apartamentos, valor da conta de energia e valor da
conta de água, calcule o rateio entre os apartamentos e mostre o valor
total que cada apartamento deve pagar;
Para testar seu programa use os valores abaixo:
Entrada Saída
20 (qtdAptos) Valor Rateio – R$ 125.00
Entrada Saída
2000.00 (valorEnergia)
500.00 (valorAgua)
*/
public class Rateio {

    private int quantidadeApartamentos;
    private float valorContaDeEnergia;
    private float valorDaContaDeAgua;

    public Rateio(int quantidadeApartamentos, float valorContaDeEnergia, float valorDaContaDeAgua) {

        if (quantidadeApartamentos != 20) {

            throw new IllegalArgumentException("Quantidade de apartamentos deve ser igual a 20");
        }

        this.quantidadeApartamentos = quantidadeApartamentos;
        this.valorContaDeEnergia = valorContaDeEnergia;
        this.valorDaContaDeAgua = valorDaContaDeAgua;
    }

    public int getQuantidadeApartamentos() {
        return quantidadeApartamentos;
    }

    public float getValorContaDeEnergia() {
        return valorContaDeEnergia;
    }

    public float getValorDaContaDeAgua() {
        return valorDaContaDeAgua;
    }

}