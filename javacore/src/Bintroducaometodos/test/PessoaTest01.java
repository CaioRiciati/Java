package Bintroducaometodos.test;

import Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("caio");
        pessoa.setIdade(-3);

        pessoa.imprime();

        System.out.print("\n"+pessoa.getNome());
        System.out.print(pessoa.getIdade());

    }


}
