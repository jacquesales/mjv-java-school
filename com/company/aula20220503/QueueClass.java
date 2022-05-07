package com.company.aula20220503;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {

    public static void main(String[] args) {
        ordemApresentacao();
    }

    static void ordemApresentacao() {
        //Queue -> coleção que processa os elementos em fila (fifo) o 1º que entra tem que ser o 1º a sair
        Queue<String> alunos = new LinkedList<>();
        alunos.add("Elizangela");
        alunos.add("Ariovaldo");
        alunos.add("Marcos");
        alunos.add("Betania");
        alunos.add("Carmela");
        alunos.add("Nino");

        System.out.println("Coleção Queue:");
        imprimirColecao(alunos);

        System.out.println("\nChamando o próximo da fila:");
        String selecionado = alunos.poll(); //remove o 1º elemento da fila, se fila vazia retorna null
        System.out.println(selecionado + " foi selecionado para a apresentação");

        System.out.println("\nAntonio pergunta quantos ainda faltam... ");
        imprimirColecao(alunos);

        System.out.println("\nAntonio pergunta quem é o proximo da fila...");
        System.out.println(alunos.peek()+" é o próximo da fila"); //apenas verificando o proximo da fila
    }

    static void imprimirColecao(Collection colecao) {
        for (Object itemObj: colecao) {
            System.out.println(itemObj);
        }
    }
}
