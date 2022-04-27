package com.company.aula20220418.grupo2;

/*
Classes Wrappers são classes empacotadoras que possues metodos para converter ou encapsular
um valor de tipo primitivo:
    int,  byte,  short,  long,  float, double, boolean, char
para objetos:
    Integer, Byte, Short, Long, Float, Double, Boolean, Character
*/

public class WrappersClasses {

    public static void main(String[] args) {

        //Métodos de classes (estáticos) e métodos de objetos wrappers
        System.out.println("----- Metodos -----");

        int num_int = 10;
        String s = "123";

        Integer wrapperInteger = Integer.valueOf(num_int); //retorna o valor
        String hexaInteger = Integer.toHexString(num_int); //representa o valor em hexadecimal
        int compare = Integer.compare(num_int, num_int); //iguais = 0  diferentes = 1
        int bitCount = Integer.bitCount(num_int); //representação binária
        int reverse = Integer.reverse(num_int); //modo reverso
        int sToInt = Integer.valueOf(s); //converte de String para int
        String integerToString = wrapperInteger.toString(); //converte de Integer do objeto wrapper para String
        float integerToFloat = wrapperInteger.floatValue(); //converte de Integer do objeto wrapper para float

        System.out.println(wrapperInteger + "\n" + hexaInteger);
        System.out.println(compare);
        System.out.println(bitCount);
        System.out.println(reverse);
        System.out.println(sToInt);
        System.out.println(integerToString + " " + integerToString.getClass().getSimpleName()); //método chamado apenas de objetos
        System.out.println(integerToFloat);
    }
}
