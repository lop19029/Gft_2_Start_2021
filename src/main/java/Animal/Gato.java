package Animal;

public class Gato extends Animal{

    @Override
    public void som() {
        System.out.println("miau");
    }

    @Override
    public int quantidadeDeRaçao() {
        int quantidadeDeRaçao = 0;

        if(this.peso <= 3) {
            quantidadeDeRaçao = this.peso * 10;
        }
        else{
            quantidadeDeRaçao = this.peso * 13;
        }
        return quantidadeDeRaçao;
    }
}

