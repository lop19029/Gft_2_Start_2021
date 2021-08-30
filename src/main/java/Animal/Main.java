package Animal;

public class Main {
    public static void main(String[] args) {
        Gato Daphne = new Gato("Daphne", 20 );
        Gato Artemis = new Gato("Artemis", 3 );
        Cachorro Xereta = new Cachorro("Xereta", 10);
        Cachorro VictorHugo = new Cachorro("Victor Hugo", 5);

        int racaoConsumida = 0;

        racaoConsumida+= Daphne.quantidadeDeRacao();
        racaoConsumida+= Artemis.quantidadeDeRacao();
        racaoConsumida+= Xereta.quantidadeDeRacao();
        racaoConsumida+= VictorHugo.quantidadeDeRacao();

        System.out.println(String.format("Entre todos os animais se consomen %dg de ração todos os dias.", racaoConsumida));
    }
}
