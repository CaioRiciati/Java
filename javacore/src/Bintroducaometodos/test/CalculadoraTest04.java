package Bintroducaometodos.test;

import Bintroducaometodos.dominio.Contas;

public class CalculadoraTest04 {
    public static void main(String[] args) {

        int A = 1;
        int B = 2;

        Contas calculadora = new Contas();
        calculadora.alteraDoisNumeros(2, 4);


        System.out.println("\n dentro do CalculadoraTest04");
        System.out.println("num1: "+A);
        System.out.println("num2:"+B);
    }
}
