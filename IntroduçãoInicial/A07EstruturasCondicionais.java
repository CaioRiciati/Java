public class A07EstruturasCondicionais {
    public static void main(String[] args) {
        //se idade < 15 categoria juvenil
        //idade >= 15 && idade <18 juvenil
        //idade >= 18 adulto
        int idade = 19;
        String categoria;
        if (idade < 15) {
            categoria = "Categoria Infantil";
            
        }else if(idade >=15 && idade < 18){
            categoria = "Categoria Adulto";
        
        }else{
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    } 
}
