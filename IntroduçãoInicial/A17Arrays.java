public class A17Arrays {
    public static void main(String[] args) {
        //byte, short, int, long, float e double : 0
        //char : '\u0000'
        //boolena: false
        //String: null

        String [] Nomes = new String[3];
         Nomes [0]= "goku";
         Nomes [1]= "vegeta";
         Nomes [2]= "naruto";
         //Nomes [3]= "sasuke";


     for(int i = 0; i < Nomes.length; i++){
        System.out.println(Nomes[i]);

        Nomes = new String[8];
     }
    }
}
