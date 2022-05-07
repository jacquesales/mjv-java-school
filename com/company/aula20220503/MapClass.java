package com.company.aula20220503;

import java.util.*;

public class MapClass {

    public static void main(String[] args) {
        ranking();
    }

    static void ranking() {
        //Map -> coleção que associa cada elemento a uma chave que não pode ser nula
        Map<Integer, String> ranking = new HashMap<>();
        ranking.put(1, "Urso-pardo");
        ranking.put(2, "Sucuri");
        ranking.put(3, "Elefante");
        ranking.put(4, "Tigre");
        ranking.put(5, "Águia");
        ranking.put(6, "Gorila");

        //percrrendo os elementos do mapa, pegando todas as entradas todos os conj de valores, retornando o entrySet
        for (Map.Entry<Integer,String> entry : ranking.entrySet()) {
            System.out.println("Ranking: "+entry.getKey()+"º - Animal: "+entry.getValue());
        }

        //para localizar um animal basta informar sua posição
        String animal = ranking.get(4);
        System.out.println(animal);
    }
}
