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

        int proximoMultiplo = intervaloInicio;

        while (proximoMultiplo <= intervaloFim){
            int resultado = multiplicando * proximoMultiplo;
            System.out.println(String.format("%d x %d = %d",multiplicando, proximoMultiplo, resultado));
            proximoMultiplo+=1;
        }


    }
}
