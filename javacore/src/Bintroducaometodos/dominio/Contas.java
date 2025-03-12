package Bintroducaometodos.dominio;

public class Contas {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public int subtraiDoisNumeros() {
        return 10;
    }

    public void multiplicaDoisNumeros(int num1, float num2, int num3) {
        System.out.println(num1 * num2);

    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("não é possivel dividir por zero");
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("não é possivel dividir por 0");

        }
    }

    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("dentro do alteraDoisNumeros");
        System.out.println("num1: " + numero1);
        System.out.println("num2: " + numero2);
    }

}
