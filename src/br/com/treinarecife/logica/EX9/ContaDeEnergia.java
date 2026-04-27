package br.com.treinarecife.logica.EX9;

/*
EX09 - Conta de Energia
Sabe-se que o quilowatt de energia custa um milésimo do salário-mínimo.
Elabore um programa que receba via teclado o valor do salário-mínimo e a
quantidade de quilowatt consumido por uma residência. Calcule e exiba:
• O valor em reais , de cada quilowatt;
• O valor da conta, em reais , a ser pago por essa residência;
• O valor da conta com desconto de 15 %
•
Para testar seu programa use os valores abaixo:
Entrada Saída
1518.00 (salarioMinimo),
300 (kw)

Valor kw: R$ 1.518
Valor da Conta: R$ 455.40
Valor com Desconto: R$ 387.09

*/
public class ContaDeEnergia implements CalculoEnergia {

    private double salario;
    private int quilowattConsumidoNoMes;

    public ContaDeEnergia(double salario, int quilowattConsumidoNoMes) {

        this.salario = salario;
        this.quilowattConsumidoNoMes = quilowattConsumidoNoMes;
    }

    public void setSalario(double salario) {

        if (salario > 0) {

            this.salario = salario;
        }
    }

    @Override
    public double valorQuilowatt() {
        double quilowatt = 1.0 / 1000.0 * this.salario;
        return quilowatt;
    }

    @Override
    public double valorConta() {
        return valorQuilowatt() * this.quilowattConsumidoNoMes;
    }

    @Override
    public void valorContaDescontada() {

        double contaComDesconto = valorConta() - 15.0 / 100.0 * valorConta() ;
        System.out.printf("Valor com desconto R$ %.2f ", contaComDesconto);
    }

}