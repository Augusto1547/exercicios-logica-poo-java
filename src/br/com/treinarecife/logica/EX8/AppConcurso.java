package br.com.treinarecife.logica.EX8;

public class AppConcurso {

    public static void main(String[] args) {

        System.out.printf(
                "Neste concurso, há um total de 380 candidatos, %n" +
                        " dos quais 200 são homens, 150 são mulheres e 30 %n" +
                        " estiveram ausentes.%n%n");

        Concurso.calcularPorcentagemDeHomens();
        System.out.printf("%n");
        Concurso.calcularPorcentagemDeAusentes();

    }
}