    package Bintroducaometodos.test;
    import Bintroducaometodos.dominio.Funcionarios;

public class FuncionariosTest {
    public static void main(String[] args) {
        
        Funcionarios funcionario01 = new Funcionarios();
        Funcionarios funcionario02 = new Funcionarios();
        Funcionarios funcionario03 = new Funcionarios();

        funcionario01.nome = "josé";
        funcionario01.idade = 32;
        funcionario01.salario = new double[]{1200,1110, 1260};

        funcionario02.nome = "claudio";
        funcionario02.idade = 19;
        funcionario02.salario = new double[]{1200,1110, 1260};;

        funcionario03.nome = "anderson";
        funcionario03.idade = 26;
        funcionario03.salario = new double[]{1200,1110, 1260};

        funcionario01.imprir();
        funcionario01.mediaSalarial();

        funcionario01.salario =  new double []{3,5,3,6};
    }
    
}

