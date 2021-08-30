package Animal;

public class Cachorro extends Animal{
    @Override
    public void som() {
        System.out.println("auau");
    }

    @Override
    public int quantidadeDeRaçao() {
        int quantidadeDeRação = 0;

        if (this.peso <= 4) {
            quantidadeDeRação = this.peso * 40;
        }
        else if (this.peso > 4 && this.peso <= 12){
            quantidadeDeRação = this.peso * 45;
        }
        else {
            quantidadeDeRação = this.peso * 55;
        }

        return quantidadeDeRação;
    }
}
