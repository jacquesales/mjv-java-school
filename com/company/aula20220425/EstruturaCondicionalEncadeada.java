package com.company.aula20220425;

public class EstruturaCondicionalEncadeada {
    public static void main(String[] args) {

        simuladorMulta(60);
    }

    static void simuladorMulta(int velocidade) {

        if (velocidade >= 70 && velocidade <= 80) {
            System.out.println("Multa leve");
        } else if (velocidade > 80 && velocidade <= 100) {
            System.out.println("Multa grave");
        } else if (velocidade > 100) {
            System.out.println("Multa gravíssima");
        } else {
            System.out.println("Você está dentro da velocidade e não foi multado!");
        }
    }
}
