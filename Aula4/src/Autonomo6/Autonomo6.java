package Autonomo6;

import java.util.Scanner;

public class Autonomo6 {

    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);

        System.out.println("Introduza um número:");

        int n = in.nextInt();

        System.out.println(primos(n));
    }

    public static boolean ePrimo(int a){
        if (a <= 1){ return false; }

        for (int i = 2; i < a/2; i++){
            if (a % i == 0){ return false; }
        }
        return true;
    }

    public static int primos(int n){
        for (int i = 2; i < n; i++){
            if (ePrimo(i)){
                System.out.println(i);
            }
        }
        return 0;
    }
}
