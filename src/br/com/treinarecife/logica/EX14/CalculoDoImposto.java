package br.com.treinarecife.logica.EX14;

import java.util.ArrayList;
import java.util.List;
/*
EX14 – Cálculo do Imposto
Faça um programa que receba a soma de todas as verbas recebidas por um
funcionário no mês, em uma variável do tipo real denominada Salário Bruto.
Após o recebimento calcule e exiba na tela o valor do imposto de renda, o
valor do INSS e o salário líquido que é obtido abatendo-se do Salário Bruto
da soma dos descontos descritos na tabela abaixo:

Fórmula para calcular o percentual:
Para testar seu programa use os valores abaixo:
Descontos

Imposto de Renda: Valor_IR ➔ 5% do Salário Bruto
INSS: Valor_INSS ➔ 11% do Salário Bruto
vlrPerc = valor ∗
Perc
100

Entrada Saída
6500.00 (salarioBruto)

Valor do IR: R$ 325.00
Valor do INSS: R$ 715.00
Salário Líquido: R$ 5460.00

10000.00 (salarioBruto)

Valor do IR: R$ 500.00
Valor do INSS: R$ 1100.00
Salário Líquido: R$ 8400.00
 */

public class CalculoDoImposto {

    /**
     * O que significa: <TipoGenerio extends Number>
     * Esse método aceita listas de qualquer tipo
     * que seja um número (Integer, Double, Long, Float, etc.),
     * mas não aceita outros tipos como String ou objetos aleatórios."
     * Ou seja, o é uma restrição de tipo. Ele garante que o compilador
     * só permita tipos que herdam da classe . Isso é útil porque todos esses
     * tipos têm métodos como , , etc., que permitem converter para um valor
     * numérico real. Sem esse extends Number, o compilador não teria como saber
     * que valor tem o método doubleValue().
     * 
     * Por que usar valor.doubleValue() em vez de salarioBruto += valor;
     * O motivo é que valor não é um double, mas sim um objeto genérico que herda de
     * Number.
     * - Number é uma classe abstrata que representa números, mas não é um tipo
     * primitivo.
     * - Para somar, você precisa transformar esse objeto em um valor numérico
     * primitivo (double, int, etc.).
     * O método doubleValue() faz exatamente isso: pega o objeto Number e devolve o
     * valor correspondente em double.
     * 
     */
    public static <TipoGenerico extends Number> double somaEntradasDoMes(List<TipoGenerico> ganhos) {
        double salarioBruto = 0.0;
        for (TipoGenerico valor : ganhos) {
            salarioBruto += valor.doubleValue();
        }
        return salarioBruto;
    }

    public static double calcularImpostoDeRenda() {
        double impostoDeRenda = 5.0 / 100.0;
        return impostoDeRenda;
    }

    public static double calcularInss() {
        double calculoInss = 11.0 / 100.0;
        return calculoInss;
    }

    void main(String[] args) {
        List<Double> ganhosFuncionario = new ArrayList<>();
        ganhosFuncionario.add(1000.00);
        ganhosFuncionario.add(500.00);
        ganhosFuncionario.add(4000.00);
        ganhosFuncionario.add(1000.00);

        double totalGanho = somaEntradasDoMes(ganhosFuncionario);
        double calculoImpostoRenda = totalGanho * CalculoDoImposto.calcularImpostoDeRenda();
        double calculoInss = totalGanho * calcularInss();
        double salarioLiquido = totalGanho - (calculoImpostoRenda + calculoInss);

        System.out.printf("Salário Bruto: R$ %.2f%n ", totalGanho);
        System.out.printf("Valor do IR: R$ %.2f%n ", calculoImpostoRenda);
        System.out.printf("Valor INSS: R$ %.2f%n ", calculoInss);
        System.out.printf("Salário Líquido: R$ %.2f%n ", salarioLiquido);

    }

}