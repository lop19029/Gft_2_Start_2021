package Cargos;

public class Pessoa {
    private String nome;
    private String cargo;

    public Pessoa(String nome, String cargo) {
        this.nome = nome;
        checarEDefinirCargo(cargo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        checarEDefinirCargo(cargo);
    }

    public void checarEDefinirCargo(String cargo){
        String cargoFormated = cargo.toLowerCase().replaceAll("\\s", "");
        if (cargoFormated.equals("starter")){
            this.cargo = "Starter";
        }
        else if(cargoFormated.equals("junior")){
            this.cargo = "Junior";
        }
        else {
            this.cargo = "Senior";
        }
    }
}
