package com.company.aula20220425;

public class EstruturasCondicionais {
    public static void main(String[] args) {

        caixaEletronicoFluxoSimples(15.0, 13.0);
        caixaNotaEscolarFluxoComposto(8);
    }

    static void caixaEletronicoFluxoSimples(double saldo, double valorSolicitado) {

        //as chaves são cruciais pra contemplar mais de uma linha/regra de negócio dentro do if
        if (valorSolicitado <= saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        }
        System.out.println("Fim");
    }

    static void caixaNotaEscolarFluxoComposto(double nota) {

        if (nota <= 5) {
            System.out.println("Reprovado(a)");
        } else {
            System.out.println("Aprovado(a)");
        }
    }
}
