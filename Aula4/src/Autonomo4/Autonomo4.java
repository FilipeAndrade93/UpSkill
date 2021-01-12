package Autonomo4;

import java.util.Scanner;

public class Autonomo4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Introduza o divisor:");

        int a =  in.nextInt();

        int total = 0;

        for ( int i = 1; i < a; i++){
            if (a % i == 0){
            }
                total = total + i;
            }
        System.out.println("O somatório dos divisores é: " + total);
    }
}
