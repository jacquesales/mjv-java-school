package com.company.aula20220425;

public class EstruturaCondicionalSwitchCase {
    public static void main(String[] args) {

        int numeroSemana = 8;

        switch(numeroSemana) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado-feira");
                break;
            case 7:
                System.out.println("Domingo-feira");
                break;
            default:
                System.out.println("Esse dia da semana não existe");
        }
    }
}
