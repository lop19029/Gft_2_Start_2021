package Animal;

public class Gato extends Animal{

    public Gato(String nome, int peso) {
        super(nome, peso);
    }

    @Override
    public void som() {
        System.out.println("miau");
    }

    @Override
    public int quantidadeDeRacao() {
        int quantidadeDeRacao = 0;

        if(this.peso <= 3) {
            quantidadeDeRacao = this.peso * 10;
        }
        else{
            quantidadeDeRacao = this.peso * 13;
        }
        return quantidadeDeRacao;
    }
}

