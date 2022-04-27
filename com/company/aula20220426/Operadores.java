package com.company.aula20220426;

import java.util.Date;

public class Operadores {

    public static void main(String[] args) {

        //Atribuição
        String nome = "Jacqueline";
        int idade = 18;
        double peso = 62.5;
        char genero = 'F';
        boolean doadorOrgao = true;
        Date dataNascimento = new Date();

        //Aritméticos
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);

        //Atenção: operador + pode concatenar valores de vários tipos
        String concatenacao = 1+1+1+"1"; //realiza a operação e concatena com a String
        String concatenacao2 = 1+"1"+1+1; //apenas concatena pois identificou uma String
        String concatenacao3 = 1+"1"+1+"1"; //apenas concatena pois identificou uma String
        String concatenacao4 = "1"+1+1+1; //apenas concatena pois iniciou com String
        String concatenacao5 = "1"+(1+1+1); //concatena a String com a operação realizada entre parênteses
        System.out.println(concatenacao+"\n"+concatenacao2+"\n"+concatenacao3+"\n"+concatenacao4+"\n"+concatenacao5);

        //Unários
        int numero = 10;

        numero = -numero;
        System.out.println("Tornando a variavel negativa: "+ numero);
        numero = -numero;
        System.out.println("Tornando a variavel positiva: "+ numero);

        int valor = 5;
        System.out.println("Exibindo o valor e depois incrementando: "+ valor++); //pos incremento
        System.out.println("Incrementando e exibindo o valor: "+ ++valor); //pre incremento

        boolean verdade = true;
        System.out.println(!verdade); //negando expressão booleana

        //Lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        //Se condicao1 e condicao2 forem verdadeiras, executar código
        if(condicao1 && condicao2)
            System.out.println("Os dois valores precisam ser verdadeiros");

        //Se condicao1 ou condicao2 for verdadeira, executar código
        if(condicao1 || condicao2)
            System.out.println("Um dos valores precisa ser verdadeiro");
    }
}
