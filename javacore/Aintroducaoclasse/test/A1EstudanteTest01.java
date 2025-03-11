package Aintroducaoclasse.test;

import Aintroducaoclasse.domain.Estudante;

public class A1EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "caio";
        estudante.idade = 17;
        estudante.genero= 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.genero);

    }
    
}
