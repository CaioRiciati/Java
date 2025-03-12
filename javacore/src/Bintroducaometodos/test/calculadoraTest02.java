package Bintroducaometodos.test;

import Bintroducaometodos.dominio.*;

public class calculadoraTest02 {
    public static void main(String[] args) {
        Contas calculadora = new Contas();
        System.out.println(calculadora.subtraiDoisNumeros());
        calculadora.multiplicaDoisNumeros(10,20.9f, 64);

        calculadora.somaDoisNumeros();
    }  
}