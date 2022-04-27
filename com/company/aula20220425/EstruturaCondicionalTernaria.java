package com.company.aula20220425;

public class EstruturaCondicionalTernaria {
    public static void main(String[] args) {

        simuladorDecolagem(100);
        simuladorDecolagem(5000);
    }

    //fluxo de atribuição (um valor ou outro) e não comportamental (o fluxo não é redirecionado)
    static void simuladorDecolagem(int altitude) {

        String estagioVoo = (altitude >= 5000) ? "voo estável" : ((altitude < 5000 && altitude >= 5) ? "subindo..." : "não decolou");
        System.out.println("Estágio da decolagem: " + estagioVoo);
    }
}
