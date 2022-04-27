package com.company.aula20220425;

public class EstruturaRepeticaoForForeach {
    public static void main(String[] args) {

        for (int num = 10; num > 0; num--) {
            System.out.println("Falta(m) " + num + " segundo(s)");
        }

        System.out.println("--------------------------------------");

        //Foreach é usado para percorrer arrays e colletions
        String alunos [] = {"Paula", "Bruno", "Edi", "Fabiana"};
        int numeros [] = {2, 17, 33, 38, 42, 56};

        System.out.println("Integrantes do grupo:");
        for (String aluno: alunos) {
            System.out.println(aluno);
        }

        System.out.println("Números da sorte:");
        for (int num: numeros) {
            System.out.println(num);
        }
    }
}
