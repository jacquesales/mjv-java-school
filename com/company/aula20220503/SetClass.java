package com.company.aula20220503;

import java.util.*;

public class SetClass {

    public static void main(String[] args) {

        //Set -> coleção que não pode ter elementos repetidos considerando algoritmo hash
        Set<String> alunos = new HashSet();
        alunos.add("Ana");
        alunos.add("João");
        alunos.add("Luana");
        alunos.add("João"); //o Set não permite add dados repetidos

        System.out.println("Coleção Set:");
        for (String a: alunos)
            System.out.println(a);

        //em caso de coleção List
        List<String> alunosList = new ArrayList();
        alunosList.add("Ana");
        alunosList.add("João");
        alunosList.add("Luana");
        alunosList.add("José");
        alunosList.add("Camila");
        alunosList.add("Luana");
        alunosList.add("José");

        //remover cadastros duplicados
        setPower(alunosList);
    }

    static void setPower(List<String> alunos) {
        Set<String> alunosArrumado = new TreeSet<>();//TreeSet implementa o SortedSet para ordenar
        for (String aluno: alunos) {
            boolean adiciona = alunosArrumado.add(aluno);
            String adicionado = adiciona?"Adicionado": "NÃO adicionado";
            System.out.println(adicionado + " o aluno "+aluno);
        }
        System.out.println("\nImprimindo uma lista ordenada, sem cadastros repetidos: ");
        imprimirColecao(alunosArrumado);
    }

    static void imprimirColecao(Collection colecao) {
        for (Object itemObj: colecao) {
            System.out.println(itemObj);;
        }
    }
}
