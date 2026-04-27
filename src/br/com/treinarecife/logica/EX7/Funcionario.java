package br.com.treinarecife.logica.EX7;

/*
EX07 - Acréscimo ao salário de um empregado a Receber
Faça um programa que receba do teclado o salário fixo de um vendedor em
reais e o valor total de vendas efetuadas por ele em um determinado mês.
Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
efetuadas no mês, calcular e exibir o valor total a receber no final do mês.
Para testar seu programa use os valores abaixo:
Entrada Saída

1567.00 (salario)
10000.00 (totVendas)

R$ 3067.00

3000.00 (salario)
3789.00 (totVendas) R$ 3568,35
Para calcular quanto representa um percentual de um determinado o valor
utilize esta xpressão: ValorPercentual = Valor ∗
Perc
100
*/
public class Funcionario {

    private double salarioFixo;

    private double totalVendasEfetuadasNoMes; // Em reais

    public Funcionario(double salarioFixo, double totalVendasEfetuadasNoMes) {

        this.salarioFixo = salarioFixo;
        this.totalVendasEfetuadasNoMes = totalVendasEfetuadasNoMes;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        
        if (salarioFixo > 0) {
            this.salarioFixo = salarioFixo;
        } else {
            System.out.println("Salário inválido, deve ser positivo.");
        }

    }

    public double getTotalVendasEfetuadasNoMes() {
        return totalVendasEfetuadasNoMes;
    }

    public void setTotalVendasEfetuadasNoMes(double totalVendasEfetuadasNoMes) {
        this.totalVendasEfetuadasNoMes = totalVendasEfetuadasNoMes;
    }

    /**
     * Salário com comissão a receber
     */
    public void salarioMaisComissao() {

        double comissao = this.totalVendasEfetuadasNoMes * (15.0 / 100.0);
        double salarioFinal = this.salarioFixo + comissao;

        System.out.println("Salário final com comissão: " + String.format("R$ %.2f", salarioFinal));
    }
}