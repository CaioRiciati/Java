package Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char genero;
    public int RA;

    public void imprime(){
        System.out.println("-----------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.genero);
        System.out.println(this.RA);
    }

}

