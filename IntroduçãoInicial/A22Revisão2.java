public class A22Revisão2 {
    public static void main(String[] args) {
        String pares = " ";
        String impar = " ";
        int[] numeros = {2,3,4,1,5,2,7,4,8,5,7,3 };
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares += numeros[i] + " ";
                
            }

            if (numeros[i] % 2 == 1 ) {
                impar += numeros[i] + " ";
                
            }
        }
        System.out.println("os numeros pares são: " + pares );
        System.out.println("***************");
        System.out.println("e os numeros impares são: "+ impar);
    }
}