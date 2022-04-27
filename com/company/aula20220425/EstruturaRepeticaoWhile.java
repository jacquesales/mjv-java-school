package com.company.aula20220425;

import java.util.concurrent.ThreadLocalRandom;

//será executado até que a validação torne-se falsa
public class EstruturaRepeticaoWhile {
    public static void main(String[] args) {

        exemploWhile();
    }

    static void exemploWhile() {
        double mesada = 50.0;

        while(mesada > 0) {
            Double valorDoce = valorAleatorio();

            if(valorDoce > mesada)
                valorDoce = mesada;
            System.out.println(String.format("Valor do doce: %.2f adicionado no carrinho", valorDoce));
            mesada -= valorDoce;
        }
        System.out.println("Mesada: " + mesada);
    }

    static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(5, 10);
    }
}
