package br.com.treinarecife.logica.EX24;

/**
 * Aula 06 - Composição ou Agregação
 * https://www.youtube.com/watch?v=ezE5Wghl0nY
 * Lógica no dicionário e condição, bifurcação
 * A lógica de programação é a arte de isolar o como as coisas são feitas.
 * "Um dado entra, sofre uma transformação(refinamento) e gera um resultado"
 * A herança não é uma democracia, é uma monarquia.
 * private: "Isso é tão crítico para o meu funcionamento que nem o meu
 * sucessor tem maturidade para mexer diretamente".
 * "O filho realmente precisa alterar isso? Ou ele só precisa que eu
 * execute uma ação?".
 * private diz ao seu cérebro: "Esqueça isso, é detalhe interno".
 * public diz: "Isso aqui é a minha promessa para o mundo".
 * protected diz: "Isso é um segredo de família".
 * "A arte de programar consiste em organizar e dominar a complexidade.
 * " — Edsger W. Dijkstra.
 * - Programar se resume na interação entre caracteristicas e comportamentos
 * - Sempre que der prefira composição em vez de herança (Eu devo usar herança
 * aqui?)
 * - Aluno usa professor
 * - Debugar = consertar o que está quebrado.(pode debugar no processo de
 * desenvol..)
 * -Refatorar = melhorar o que já funciona. (existem ferramentas para
 * refatorar)
 * -Sono, Cardio, 1 hora de treino, Alimentação adequada
 * -O que eu quero gerar daqui?
 * Algo pode atrapahar ou desviar o percurso?
 * Qual é a condição para que isso aconteça?
 * -Modo disperso e concentrado
 * --------------------------------------------------------------------
 * EX24– Transformar em Ano, Mês, Dia
 * Desenvolva um programa que receba um valor inteiro relacionado à idade de uma
 * pessoa em dias e informe-a em anos, meses e dias. Obs: Apenas para facilitar
 * o cálculo, considere todo ano com 365 dias e todo mês com 30 dias.
 * Para testar seu programa use os valores abaixo:
 * Entrada Saída
 * 400
 * 
 * 1 ano (s)
 * 1 mês (es)
 * 5 dia (s)
 * 
 * 800
 * 
 * 2 ano (s)
 * 2 mês (es)
 * 10 dia (s)
 * 
 * 30
 * 
 * 0 ano (s)
 * 1 mês (es)
 * 0 dia (s)
 * extamente lá!, política de retenção, meta dados, lulgar natural,
 * apenas para o compilador, transformado em bytecode, descartada,
 * nunca chega a ocupar espaço no Metaspace, ler anotações em tempo de execução,
 * joga toda a estrutura
 */
public class ConversaoIdade {

  public static void converterIdades(int idade) {

    if (idade > 324) {

      int ano = idade % 3;
      System.out.println(ano);

    } else {

      throw new IllegalArgumentException("Valor inválido: só ceitamos valores acima de 324");
    }
  }

  public static void main(String[] args) {

    ConversaoIdade.converterIdades(400);

  }

}