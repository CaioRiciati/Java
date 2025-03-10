public class A5operadoresLogicos {
    public static void main(String[] args) {
        //  &&(and) ||(or) !(negação)
      
        int idade = 24;
        float salario = 3500f;
        boolean isDentroDaLei = idade > 30 && salario > 4612;


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlaystation = 5000F;
    
        boolean isPlaystation5Compravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupança > valorPlaystation;
    
        System.out.println("Dá para comprar o Playstation? " + isPlaystation5Compravel);
    
        //Operadores de atribuição :  = , += , -=. *=, /= , %=

        double bonus = 1800;
        bonus += 200;
        System.out.println(bonus);


        //
        int contador =  0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        System.out.println(contador++);// colocando o ++ depois , mas ja na horad e imprimir, primeiro ele imprime e só dps ele adiciona +1


    }


}

