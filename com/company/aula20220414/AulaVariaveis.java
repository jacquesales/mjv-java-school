package com.company.aula20220414;

public class AulaVariaveis {
    public static void main(String[] args) {
        String palavra = " jacqui ";

        //Declarando uma constante
        final String PALAVRA = "JAVA";

        System.out.println("Substituindo caracteres:");
        String palavraCorrigida = palavra.replace("i", "e");
        System.out.println(palavraCorrigida);

        palavra = palavraCorrigida.trim();
        System.out.println("Removendo espaços em branco:");
        System.out.print(palavra);

        System.out.println("\nString original convertida para letras maiúsculas:");
        System.out.print(palavra.toUpperCase() + "\n");
    }
}
