package br.com.treinarecife.logica.EX8;

/*
Estatística Concurso Público
Em um determinado concurso público são informados via teclado as
quantidades de candidatos presentes do que são do sexo masculino e do
sexo feminino, bem como o total dos ausentes(200h,150m,30au,380total,350total). 
Pede-se para calcular e exibir os percentuais solicitados abaixo:
P1 = O Percentual de Homens presentes em relação ao total de candidatos
inscritos;
P2 = O Percentual dos Ausentes em relação ao total dos presentes.
Para calcular o percentual entre duas grandezas devemos utilizar a seguinte
expressão:
Percentual =

Parte ∗ 100
/Todo

Para testar seu programa use os valores abaixo:

Onde: Parte = Grandeza_Menor ; Todo = Grandeza_Mior

Entrada Saída
200 (Homens)
150 (Mulheres)
30 (Ausentes)

P1 = 52.6315%
P2 = 8.5714%
*/
public class Concurso {

    public static final short TOTAL_CANDIDATOS = 380;
    public static final short TOTAL_CANDIDATOS_PRESENTES = 350;

    public static void calcularPorcentagemDeHomens() {

        double porcentagemHomens = 200.0 / TOTAL_CANDIDATOS * 100.0;
        System.out.println("O percentual de homens presentes no cocurso é de: " + String.format("%.4f", porcentagemHomens) + "%");
    }

    public static void calcularPorcentagemDeAusentes() {

        double porcentagemAusentes = 30.0 / TOTAL_CANDIDATOS_PRESENTES * 100.0;
        System.out.println("O percentual de ausentes no cocurso é de: " + String.format("%.4f",porcentagemAusentes) + "%");

    }

}