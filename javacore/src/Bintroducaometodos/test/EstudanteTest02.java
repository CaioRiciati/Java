   package Bintroducaometodos.test;
   import Bintroducaometodos.dominio.*;



public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Estudante estudante3 = new Estudante();


        estudante02.nome = "NARUTO";
        estudante02.idade = 21;
        estudante02.genero = 'M';

        estudante01.nome = "kakuzu";
        estudante01.idade = 31;
        estudante01.genero = 'M';
        estudante01.RA = 128823001;

        estudante3.nome = "sasuke";
        estudante3.idade = 16;
        estudante3.genero = 'M';

        estudante01.imprime();
        estudante01.imprime();
        estudante01.imprime();
        estudante01.imprime();
    }
}
