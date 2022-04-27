package com.company.aula20220414;

import java.util.Scanner;

public class BoletimEstudantil {

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");

        int mediFinal = usuario.nextInt();

        if (mediFinal < 6)
            System.out.println("REPROVADO");
        else if (mediFinal == 6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
    }
}
