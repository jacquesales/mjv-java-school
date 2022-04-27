package com.company.aula20220418.grupo2;

import java.util.ArrayList;
import java.util.List;

/*
Autoboxing converte automaticamente os valores primitivos em suas respectivas classes de wrapper
Unboxing é o processo reverso, objetos da classe wrapper em seus tipos de dados primitivos correspondentes
*/

public class IntegerClass {

    public static void main(String[] args) {

        //Autoboxing
        System.out.println("----- Autoboxing -----");
        int num = 21033;
        Integer numInteger = num;
        //List<int> numeros = new ArrayList<>(); //ERRO de compilação, Generics não aceito
        List<Integer> numeros = new ArrayList<>(); // OK
        System.out.println(numInteger + " " + "Tipo: " + numInteger.getClass().getSimpleName()); //Este método pode ser chamado apenas de objetos

        //Unboxing
        System.out.println("----- Unboxing -----");
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(num);
        int num_int = lista.get(0);
        System.out.println("int: " + num_int);

    }
}
