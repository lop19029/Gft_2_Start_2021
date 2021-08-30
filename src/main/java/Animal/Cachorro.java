package Animal;

public class Cachorro extends Animal{


    public Cachorro(String nome, int peso) {
        super(nome, peso);
    }

    @Override
    public void som() {
        System.out.println("auau");
    }

    @Override
    public int quantidadeDeRacao() {
        int quantidadeDeRacao = 0;

        if (this.peso <= 4) {
            quantidadeDeRacao = this.peso * 40;
        }
        else if (this.peso > 4 && this.peso <= 12){
            quantidadeDeRacao = this.peso * 45;
        }
        else {
            quantidadeDeRacao = this.peso * 55;
        }

        return quantidadeDeRacao;
    }
}
