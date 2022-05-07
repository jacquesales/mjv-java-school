package com.company.aula20220503;

import java.util.Arrays;
import java.util.List;

public class CollectionClass {

    public static void main(String[] args) {

        //Collection é uma interface que possui subcoleções List, Set, Queue e Map
        //exemplo de iteração funcional sobre a coleção List
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list.stream().forEach(System.out::print); //sintaxe de method reference
        System.out.println();
        list.stream().forEach(i -> System.out.print(i + " ")); //função lambda

        /* Já o Framework Collections proporciona metodos estáticos para ordenar/manipular as coleções
        - sort classifica com base em um atributo comparável
        - reverse inverte os elementos
        - suffle retorna os elementos aleatoriamente (embaralha)
        - copy copia uma coleção para outra
         */
    }
}
