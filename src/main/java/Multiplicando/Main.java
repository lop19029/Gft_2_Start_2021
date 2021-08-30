package Multiplicando;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Pedir input

        Scanner scanner = new Scanner(System.in);
        System.out.println("Multiplicando: ");
        int multiplicando = scanner.nextInt();

        System.out.println("Inicio do intervalo: ");
        int intervaloInicio = scanner.nextInt();

        System.out.println("Fim do intervalo: ");
        int intervaloFim = scanner.nextInt();

        //Checar regras
        if(multiplicando < 0 || multiplicando > 1500){
            System.out.println("O multiplicando não pode ser negativo e não pode ser maior que 1500.");
            System.exit(0);
        }
        else if(intervaloInicio < 0 || intervaloInicio > 1500 || intervaloFim < 0 || intervaloFim > 1500 ){
            System.out.println("Tanto o início como o fim do intervalo, não podem ser números negativos e não\n" +
                    "podem ser maiores de 1500.");
            System.exit(0);
        }
        else if(intervaloInicio > intervaloFim){
            System.out.println("O início do intervalo é menor que o fim.");
            System.exit(0);
        }
        else if((intervaloFim - 9) > intervaloInicio ){
            System.out.println("O intervalo não pode ter uma diferença maior que 10.");
            System.exit(0);
        }

        //Calcular
        int proximoMultiplo = intervaloInicio;

        while (proximoMultiplo <= intervaloFim){
            int resultado = multiplicando * proximoMultiplo;
            System.out.println(String.format("%d x %d = %d",multiplicando, proximoMultiplo, resultado));
            proximoMultiplo+=1;
        }


    }
}
