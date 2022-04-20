package com.company.aula20220418.grupo1;

/* String é imutável e não precisa ser instanciada
Sobrecarga: (mesmo metodo com parâmetros diferentes)
*/

public class StringClass {

    public static void main(String[] args) {
        String frase = "Eu amo Java";

        //método que retorna o numero de caracteres
        int caracteres = frase.length();
        System.out.println(caracteres);

        //método que retorna caracteres em formato maiúsculo
        String fraseMaiuscula = frase.toUpperCase();
        System.out.println(fraseMaiuscula);

        //método que retorna caracteres em formato minusculo
        String fraseMinuscula = frase.toLowerCase();
        System.out.println(fraseMinuscula);

        //método que retorna caracteres concatenados
        String fraseConcatenada = frase.concat("\nRealmente " + frase);
        System.out.println(fraseConcatenada);

        //exemplo de sobrecarga
        //metodo que retorna a posição do 1º elemento até a posição anterior do 2º elemento
        System.out.println(frase.substring(4));
        System.out.println(frase.substring(4, 9));

    }
}
