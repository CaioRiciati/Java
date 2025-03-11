package Aintroducaoclasse.test;

import Aintroducaoclasse.domain.*;


public class A2EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudant2 = new Estudante();
        Professor professor = new Professor();

        estudant2.nome = "Ben 10";
        estudant2.idade = 10;
        professor.genero = 'M';

        System.out.println(professor.nome + ", "+ professor.idade +" ,"+ professor.genero);
        System.out.println();
        System.out.println();

        System.out.println("------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.genero);
    }
}
