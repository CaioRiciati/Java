    package Bintroducaometodos.test;

import Bintroducaometodos.dominio.Contas;

public class CalculadoraTest05 {
        public static void main(String...  args) {
            Contas calculadora = new Contas();

            int [] numeros = {41,24,54,86,46,24,1000};
            calculadora.somaArray(numeros);

            System.out.println("---------------");
            calculadora.somaVarArgs(10,234,42,2,4,67,4,54,57);
                
        }


    
}
