package Exercicio5;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Introduza uma algarismo:");

        int a = in.nextInt();

        if (!exists(a)){
            System.out.println("O algarismo " + a + " não está presente no array.");
        } else {
            System.out.println("O algarismo " + a + " está presente no array.");
        }
    }

    public static boolean exists(int x) {
        int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        return IntStream.of(v).anyMatch(n -> n == x);
    }
}
