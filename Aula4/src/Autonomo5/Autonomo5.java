package Autonomo5;

import java.util.Scanner;

public class Autonomo5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduza um número:");

        int a = in.nextInt();

        System.out.println(isPrime(a));
    }

    public static boolean isPrime(int a){
        for (int i = 2; i <= a/2; i++){
            if (a % i == 0){ return false; }
            }
        return true;
    }
}
