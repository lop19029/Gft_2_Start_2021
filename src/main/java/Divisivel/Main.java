package Divisivel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Pedir input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        List<Integer> divisivel = new ArrayList<>();

        if(numero % 3 == 0){
            divisivel.add(3);
        }
        if(numero % 6 == 0){
            divisivel.add(6);
        }
        if(numero % 7 == 0){
            divisivel.add(7);
        }

        String listaDivisivel = Arrays.toString(divisivel.toArray()).replace("[", "").replace("]", "");

        System.out.println("Divisivel por "+ listaDivisivel);


    }
}
