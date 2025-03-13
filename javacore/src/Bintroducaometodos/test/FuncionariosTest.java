    package Bintroducaometodos.test;
    import Bintroducaometodos.dominio.Funcionarios;

public class FuncionariosTest {
    public static void main(String[] args) {
        
        Funcionarios funcionario01 = new Funcionarios();
        Funcionarios funcionario02 = new Funcionarios();
        Funcionarios funcionario03 = new Funcionarios();

        funcionario01.nome = "josé";
        funcionario01.idade = 32;
        funcionario01.salario = 3650;

        funcionario02.nome = "claudio";
        funcionario02.idade = 19;
        funcionario02.salario = 2560;

        funcionario03.nome = "anderson";
        funcionario03.idade = 26;
        funcionario03.salario = 2230;

        funcionario01.imprir();
    }
    
}

