package Animal;

abstract class Animal {
    public String nome;
    public Integer peso;

    public Animal(String nome, int peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public abstract void som();

    public abstract int quantidadeDeRacao();

}
