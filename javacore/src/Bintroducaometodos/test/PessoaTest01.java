package Bintroducaometodos.test;

import Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("caio");
        pessoa.setIdade(17);

        pessoa.imprime();

    }


}
