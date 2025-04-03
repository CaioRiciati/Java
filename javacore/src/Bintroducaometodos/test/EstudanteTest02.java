   package Bintroducaometodos.test;
   import Bintroducaometodos.dominio.*;



public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Estudante estudante3 = new Estudante();


        estudante02.nome = "nome1";
        estudante02.idade = 21;
        estudante02.genero = 'M';

        estudante01.nome = "nome2";
        estudante01.idade = 31;
        estudante01.genero = 'M';
        estudante01.RA = 128823001;

        estudante3.nome = "nome3";
        estudante3.idade = 16;
        estudante3.genero = 'M';

        estudante01.imprime();


        System.out.println("------------");
        int[] numeros = {24,214,54,34};

        for (int i : numeros) {
            System.out.println(i);
            
        }
    }
}
