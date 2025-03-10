public class A09Exercicio {
    public static void main(String[] args) {
        double salario = 70000;
        double primeiraFaixa = 9.70/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.50/100;

        if (salario <= 34712) {
         double salari2 = salario * primeiraFaixa;
         salario = salario - salari2;


            System.out.println("a taxa em cima do seu salario é de 9.70%, total: " + salario + " com um imposto de " + salari2);
            
        }else if (salario > 34712 && salario <= 68507) {

            double salari2 = salario * segundaFaixa;
            salario = salario - salari2;
            System.out.println("a taxa em cima do seu salario é de: 37,35%, total: " + salario + " com um imposto de " + salari2);
            
        }else{

            double salari2 = salario * terceiraFaixa;
            salario = salario - salari2;
            System.out.println("a taxa em cima do seu salario é de 49.50%, total: " + salario + " com um imposto de " + salari2);
        }
    }
}
