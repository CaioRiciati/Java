package Bintroducaometodos.test;

import Bintroducaometodos.dominio.*;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Estudante estudante3 = new Estudante();
        impressoraEstudante impressora = new impressoraEstudante();

        estudante02.nome = "NARUTO";
        estudante02.idade = 21;
        estudante02.genero = 'M';

        estudante01.nome = "kakuzu";
        estudante01.idade = 31;
        estudante01.genero = 'M';

        estudante3.nome = "sasuke";
        estudante3.idade = 16;
        estudante3.genero = 'M';

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);

        impressora.imprime(estudante3);

        System.out.println("########################");

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);

        impressora.imprime(estudante3);
        impressora.imprime(estudante3);


    }
}