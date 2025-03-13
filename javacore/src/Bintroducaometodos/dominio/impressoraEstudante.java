package Bintroducaometodos.dominio;

public class impressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println("----------");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.genero);
        System.out.println(estudante.RA);

        estudante.RA = 21112312;
    }
}
