package br.com.treinarecife.logica.EX22;

/*
EX22 – Impostos do Casal
Elabore um programa que permita calcular o imposto de renda (IR) de um
casal a partir das rendas do homem(RH) e da renda da mulher(RM). O
imposto é calculado sobre a renda conjunta (RC=RH+RM) de acordo com a
tabela ao abaixo. Exibir ao final na tela a renda conjunta(RC), a percentual
do imposto, o valor do imposto de renda(IR) calculado e a renda líquida.

Renda Conjunta % - IR
Até 900.00 0%
De 900.01 até 1500.00 10%
De 1500.01 até 2500.00 15%
Acima de 2500.00 25%

Para testar seu programa use os valores abaixo:
Entrada Saída

2000.00 (rendaHomem)
1500.00 (rendaMulher)

Renda Conjunta: R$
3500.00 Percentual do IR :
25%
Valor do IR : R$ 875.00
Renda Líquida: 2625.00

800.00 (rendaHomem)
0.00 (rendaMulher)

Renda Conjunta: R$ 800.00
Percentual do IR : 0%
Valor do IR : R$ 0.00
Renda Líquida: 800.00

750.00 (rendaHomem)
750.00 (rendaMulher)

Renda Conjunta: R$
1400.00 Percentual do IR :
10%
Valor do IR : R$ 140.00
Renda Líquida: 1260.00
 */
public class ImpostoCasal {

    String nomeDoMarido;
    String nomeDaEsposa;

    double rendaDoMarido(double salario, double bonus) {

        double rendaMarido = salario + bonus;
        return rendaMarido;
    }

    double rendaDaEsposa(double salario, double bonus) {

        double rendaEsposa = salario + bonus;
        return rendaEsposa;
    }

    double rendaConjunta(double salarioDoMarido, double bonusDoMarido, double salarioDaEsposa, double bonusDaEsposa) {

        double conjunta = rendaDoMarido(salarioDoMarido, bonusDoMarido) + rendaDaEsposa(salarioDaEsposa, bonusDaEsposa);
        double impostoDezPorcento = 10.0 / 100.0 * conjunta;
        double impostoQuizePorcento = 15.0 / 100.0 * conjunta;
        double impostoVinteCincoPorcento = 25.0 / 100.0 * conjunta;
        double rendaLiquidaUm = conjunta - impostoDezPorcento;
        double rendaLiquidaDois = conjunta - impostoQuizePorcento;
        double rendaLiquidaTres = conjunta - impostoVinteCincoPorcento;

        if (conjunta > 1 && conjunta <= 900.00) {

            System.out.println(nomeDoMarido + " e " + nomeDaEsposa +
                    " Vocês não pagarão imposto");

        } else if (conjunta > 900.01 && conjunta <= 1500.00) {

            System.out.printf("%s e %s, vocês possuem uma renda conjunta de: R$ %.2f. " +
            "Vocês pagarão R$ %.2f de imposto, equivalente a 10%% dos seus rendimentos. " +
            "A renda líquida (com taxação de 10%%) é: R$ %.2f%n",
            nomeDoMarido, nomeDaEsposa, conjunta, impostoDezPorcento, rendaLiquidaUm);
            
        } else if (conjunta > 1500.01 && conjunta < 2500.00) {

            System.out.printf("%s e %s, vocês possuem uma renda conjunta de: R$ %.2f. " +
            "Vocês pagarão R$ %.2f de imposto, equivalente a 15%% dos seus rendimentos. " +
            "A renda líquida (com taxação de 15%%) é: R$ %.2f%n",
            nomeDoMarido, nomeDaEsposa, conjunta, impostoQuizePorcento, rendaLiquidaDois);

        } else if (conjunta > 2500.00) {

           System.out.printf("%s e %s, vocês possuem uma renda conjunta de: R$ %.2f. " +
            "Vocês pagarão R$ %.2f de imposto, equivalente a 25%% dos seus rendimentos. " +
            "A renda líquida (com taxação de 25%%) é: R$ %.2f%n",
            nomeDoMarido, nomeDaEsposa, conjunta, impostoVinteCincoPorcento, rendaLiquidaTres);

        }  

        return conjunta;
    }

}