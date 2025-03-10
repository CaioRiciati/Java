package test;

import domain.Carro;

public class A3ExercicioCarro {

    public static void main(String[] args) {
        
    
    Carro carro1 = new Carro();
    Carro carro2 = new Carro();

    carro1.nome = "Carro vermelho";
    carro1.ano = 1994212332;
    carro1.modelo = "Sport"; 

    
    carro2.nome = "Mcqueen";
    carro2.ano = 1987;
    carro2.modelo = "Corrida"; 

    System.out.println("Carro 1");
    System.out.println(carro1.nome);
    System.out.println(carro1.modelo);
    System.out.println(carro1.ano);


    System.out.println("\nCarro 2");
    System.out.println(carro2.nome);
    System.out.println(carro2.modelo);
    System.out.println(carro2.ano);
    }
    
}
