public class A12RepetiçãoWhile {
    public static void main(String[] args) {
        // while, do while , for
        int contador = 0;
        while (contador < 11) {
            System.err.println(++contador);

        }

            contador = 0;
            int numero= 0;
        do {
            System.out.println("dento do do while " + contador++ );
        } while (contador < 10);

        

        for( int i= 0 ; i < 10; i++){
            System.out.println( "for " + i );

        }
    }

}