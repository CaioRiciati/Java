public class A8Condicionaisdnv {
    public static void main(String[] args) {
    double salario = 3000;
    String mensagemDoar = "Eu vou doar 500 pila SIM!";
    String mensagemNaoDoar = "Ainda n consigo doa :(";

    //(condição) ? true : false
    String Resultado = salario >= 5000 ? mensagemDoar : mensagemNaoDoar;
    
    System.out.println(Resultado);
}
    
}