public class A11EstruturasCoindicionaisSwitch {
    public static void main(String[] args) {
        //dado os valores de 1 a 7, defina se é dia util ou final de semana
        //considerando domingo como 1
        int dia = 3;
        switch (dia) {
                case 1:
                case 7:
                System.out.println("final de semana");  
                    break;
    
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
            System.out.println("dia da semana");  
                break;
    

            default:
                System.out.println("dia invalido");
                break;
        }
    }
}
