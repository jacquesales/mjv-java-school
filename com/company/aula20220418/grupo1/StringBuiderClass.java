package com.company.aula20220418.grupo1;

/* StringBuider é mutável, onde as partes novas são alocadas
e precisa ser instanciada, criando assim um novo objeto.
Mais perfomática do que a StringBuffer que lida de forma
assíncrona com concorrência de muitas requisições - threads
*/

public class StringBuiderClass {

    public static void main(String[] args) {
        String frase = "Viva a Vida ";
        StringBuilder sb = new StringBuilder();

        //método que concatena objetos Strings no StringBuilder
        sb.append(frase);
        sb.append("Sempre!");
        System.out.println(sb);

        //método que retorna a String no StringBuilder
        frase = sb.toString();
        System.out.println(frase);

        //método que retorna a inserção de caracteres na posição indicada
        System.out.println(sb.insert(5, "LA"));

        //método que retorna a deleção de caracteres nas posições indicadas
        System.out.println(sb.delete(5,7));

        //método que retorna a inversão de caracteres
        System.out.println(sb.reverse());

        //exemplo de sobrecarga
        sb.append(123);
        sb.append(false);
        System.out.println(sb);
    }
}
