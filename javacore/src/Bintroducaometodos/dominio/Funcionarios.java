package Bintroducaometodos.dominio;

public class Funcionarios {
    public String nome;
    public int idade;
    public double [] salario;


    public void imprir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double i : salario) {
            System.out.print(i + " ");
            
        }

    }

 public void mediaSalarial(){
    double media = 0;
    for (double i : salario) {
        media += i;
    }
    media /= salario.length;
    System.out.println("\nmedia salarial : " + media);
    System.out.println(salario.length);
 }

    
}

