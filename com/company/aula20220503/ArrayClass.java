package com.company.aula20220503;

public class ArrayClass {

    public static void main(String[] args) {

        //deve-se determinar o numero de elementos num array, não havendo dinamicidade
        String[] alunos = new String[50];

        //iterando todos os elementos desse array
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
