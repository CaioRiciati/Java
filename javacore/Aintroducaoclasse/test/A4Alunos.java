package Aintroducaoclasse.test;

import Aintroducaoclasse.domain.Alunos;
public class A4Alunos {
    public static void main(String[] args) {
        Alunos miguel = new Alunos();
        Alunos João = new Alunos();

        
        miguel.RA = 1093264846; 
        miguel.idade = 16;
        miguel.genero = 'M';


        System.out.println("RA: "+miguel.RA );
        System.out.println(miguel.idade);
        System.out.println(miguel.genero);
    }
    
}
