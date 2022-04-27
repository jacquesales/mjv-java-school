package com.company.aula20220426;

import java.util.Random;

//condição será executada no primeiro teste, mesmo que seja falsa
public class EstruturaRepeticaoDoWhile {
    public static void main(String[] args) {

        exemploDoWhile();
    }

    static void exemploDoWhile() {
        System.out.println("Discando...");

        do {
            //executando ao menos uma vez
            System.out.println("Telefone tocando");
        } while(telefoneTocando());

        System.out.println("Alô!");
    }

    static boolean telefoneTocando() {
        //se atender significa que não está mais tocando
        boolean atendeu = new Random().nextInt(4)==1; //o numero entre 1 e 4 é igual a 1
        System.out.println("Atendeu: " + atendeu);
        return ! atendeu; //negando o ato de continuar tocando
    }
}
