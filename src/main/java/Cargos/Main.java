package Cargos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        System.out.println("Controle de Funcionarios");
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 5; i++){
            System.out.println(String.format("Informe o nome da %d° pessoa: ", i));
            String pessoaNome = scanner.nextLine();

            System.out.println(String.format("Informe o cargo da %d° pessoa: ", i));
            String pessoaCargo = scanner.nextLine();

            Pessoa funcionario = new Pessoa(pessoaNome, pessoaCargo);
            pessoas.add(funcionario);
        }



        int juniors = 0;
        int starters = 0;
        int seniors = 0;

        for (int i = 0; i < pessoas.size(); i++){
            if (pessoas.get(i).getCargo() == "Junior"){
                juniors+=1;
            }
            else if(pessoas.get(i).getCargo() == "Starter"){
                starters+=1;
            }
            else if(pessoas.get(i).getCargo() == "Senior"){
                seniors+=1;
            }
        }

        System.out.println("\nTotal de pessoas");
        System.out.println(String.format("Starters: %d", starters));
        System.out.println(String.format("Juniors: %d", juniors));
        System.out.println(String.format("Seniors: %d", seniors));



    }
}
