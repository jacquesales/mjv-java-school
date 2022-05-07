package com.company.aula20220503;

import java.util.*;

public class ListClass {

    public static void main(String[] args) {
        faseAtracao();
    }

    static void faseAtracao() {
        //Listas -> coleção ordenada orientada a índice que pode ter elementos duplicados
        List<String> alunos = new ArrayList();
        alunos.add("Ana");
        alunos.add("João");
        alunos.add("Luana");
        alunos.add("José");
        alunos.add("Camila");
        alunos.add("Luana");
        alunos.add("José");

        System.out.println("Tamanho da coleção: " + alunos.size());
        System.out.println("Coleção:");
        for (String a: alunos)
            System.out.println(a);

        String alunoRemovido = alunos.remove(4);
        System.out.println("\nAluno removido: " + alunoRemovido);
        System.out.println("\nColeção atualizada:");
        for (String a: alunos)
            System.out.println(a);

        //classificar a lista
        Collections.sort(alunos);
        System.out.println("\nImprimindo a lista ordenada: ");
        imprimirColecao(alunos);

        System.out.println();
    }

    static void imprimirColecao(Collection colecao) {
        for (Object itemObj: colecao) {
            System.out.println(itemObj);
        }
    }
}
