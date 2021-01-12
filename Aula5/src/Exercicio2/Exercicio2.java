package Exercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Introduza um algarismo:");

        int a = in.nextInt();

        if (a == 1){
            System.out.println("O seu array de 1 algarismo é: " + Arrays.toString(randomize(a)));
        } else {
            System.out.println("O seu array de " + a + " algarismos é: " + Arrays.toString(randomize(a)));
        }
    }

    public static int[] randomize(int x){
        int[] v = new int[x];
        int i = 0;
        int min = 0;
        int max = 9;

        while (i != v.length) {
            v[i] = (int) (Math.random() * (max - min + 1) + min);
            i++;
        }
        return  v;
    }
}
