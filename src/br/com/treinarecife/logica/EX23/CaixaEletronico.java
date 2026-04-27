package br.com.treinarecife.logica.EX23;

/**
 * EX23 – Caixa Eletrônico
 * Elabore um programa que receba um valor inteiro. A seguir, calcule o
 * menor número de notas possíveis (cédulas) no qual o valor pode ser
 * decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A
 * seguir mostre o valor lido e a relação de notas necessárias.
 * Para testar seu programa use os valores abaixo:
 * Entrada Saída
 * 
 * 576 (valor)
 * 
 * 5 nota(s) de R$ 100
 * 1 nota(s) de R$ 50
 * 1 nota(s) de R$ 20
 * 0 nota(s) de R$ 10
 * 1 nota(s) de R$ 5
 * 0 nota(s) de R$ 2
 * 1 nota(s) de R$ 1
 * 
 * 11257 (valor)
 * 
 * 112 nota(s) de R$ 100
 * 1 nota(s) de R$ 50
 * 0 nota(s) de R5S 20
 * 0 nota(s) de R$ 10
 * 1 nota(s) de R$ 5
 * 1 nota(s) de R$ 2
 * 0 nota(s) de R$ 1
 */
public class CaixaEletronico {

    public void decomposicaoDeSedulas(int quantidade) {

        if (quantidade > 100) {

            String numero = String.valueOf(quantidade);
            char ultimaLetra = numero.charAt(numero.length() - 1);
            char penultimaLetra = numero.charAt(numero.length() - 2);
            char antiPenultimaLetra = numero.charAt(numero.length() - 3);

            for (int i = 1; i <= quantidade; ++i) {

                System.out.println(i);

            }

            
        } else {

            System.out.println("Só aceitamos valores maiores que 150");
        }

    }

    public static void main(String[] args) {

        CaixaEletronico c = new CaixaEletronico();
        c.decomposicaoDeSedulas(576);

        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Por favor, informe um número inteiro.");
         * int numInteiro = sc.nextInt();
         * 
         * // 100, 50, 20, 10, 5, 2, 1
         * 
         * 
         * String numero = String.valueOf(numInteiro);
         * 
         * char primeiraLetra = numero.charAt(0);
         * char segundaLetra = numero.charAt(1);
         * char terceiraLetra = numero.charAt(2);
         * // char penultimaLetra = numeroStrP.charAt(numeroStrP.length() - 2);
         * // char ultimaLetra = numeroStrU.charAt(numeroStrU.length() - 1);
         * System.out.println(primeiraLetra);
         * System.out.println(segundaLetra);
         * System.out.println(terceiraLetra);
         * 
         * 
         * sc.close();
         */
    }
}