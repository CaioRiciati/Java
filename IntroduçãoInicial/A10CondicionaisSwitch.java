public class A10CondicionaisSwitch {
    public static void main(String[] args) {

        byte dia = 3;
        // char, int, byte, short, enum , String

        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("opção invalida");
                break;
        }

        char genero = 'H';

        switch (genero) {
            case 'H':
                System.out.println("vc é um home");
                break;

            case 'M':
                System.out.println("vc é uma mulher");
            default:
                System.out.println(" invalido!!");
                break;
        }
                
    }
}
