package com.company.aula20220418.grupo1;

/* StringJoiner também é mutável, usado para construir uma sequência de caracteres
separados por um delimitador, precisa ser instanciada criando assim um novo objeto
*/

import java.util.StringJoiner;

public class StringJoinerClass {

    public static void main(String[] args) {

        //método que formata data e hora
        String data = String.join("/", "18","04","2022");
        System.out.println(data);
        String hora = String.join(":", "12","30","45");
        System.out.println(hora);

        String str;

        //quando elemento nulo, será tratado como String
        str = String.join(",", "Teste","Elemento nulo:", null, "Outra String");
        System.out.println(str);

        //criando array
        String[] turma = {"Projeto","Musica","Codigo"};
        String listaTurma = String.join(" - ", turma);
        System.out.println(listaTurma);

        //instanciando StringJoiner
        StringJoiner banda = new StringJoiner(" ", "Rock - ", " de SP/Santos");
        banda.add("Charlie");
        banda.add("Brown");
        banda.add("Jr");
        System.out.println(banda);

    }
}
