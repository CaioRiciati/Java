package Bintroducaometodos.dominio;

private class Pessoa {
    private String nome;
    private int idade;

    public void imprime() {
        System.out.print(this.nome + " " + this.idade);

    }
    public void setNome(String x){
        nome = x;
    }

    public void setIdade(int idade){
        if (idade <= 0) {
            System.out.print("idade invalida!! ");
            return;
        }
            this.idade = idade;

        }
        public String getNome(){
            return this.nome.toUpperCase();
    }
    public int getIdade(){
        return this.idade;
    }
}
