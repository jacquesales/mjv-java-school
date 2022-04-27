package com.company.aula20220418.grupo2;

/*
Autoboxing converte automaticamente os valores primitivos em suas respectivas classes de wrapper
Unboxing é o processo reverso, objetos da classe wrapper em seus tipos de dados primitivos correspondentes
*/

public class DoubleClass {

    public static void main(String[] args) {

        //Autoboxing
        System.out.println("----- Autoboxing -----");
        double salario = 4500.39;
        Double salarioDouble = salario;
        System.out.println(salarioDouble + " " + "Tipo: " + salarioDouble.getClass().getSimpleName()); //Este método pode ser chamado apenas de objetos

        //Unboxing
        System.out.println("----- Unboxing -----");
        Double numDouble = 4500.39;
        double db = numDouble;
        System.out.println("double: " + db);
    }
}
