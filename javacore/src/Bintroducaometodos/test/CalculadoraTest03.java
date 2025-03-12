package Bintroducaometodos.test;

import Bintroducaometodos.dominio.Contas;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Contas calculadora = new Contas();
        double result = calculadora.divideDoisNumeros(10, 2);

        calculadora.imprimeDivisaoDeDoisNumeros(4, 0);
        System.out.println(result);
        
    }
}