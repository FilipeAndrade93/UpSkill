package Exercicio6;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Introduz um algarismo (0 - 10):");

        int a = in.nextInt();

        if (ocurrencias(a, randomize(10)) == 1){
            System.out.println("O algarismo " + a + " existe apenas 1 vez");
        } else {
            System.out.println("O algarismo " + a + " existe " + ocurrencias(a, randomize(10)) + " vezes");
        }
    }

    public static int[] randomize(int x){
        int[] v = new int[x];
        int i = 0;
        int min = 0;
        int max = 10;

        while (i != v.length) {
            v[i] = (int) (Math.random() * (max - min + 1) + min);
            i++;
        }
        return v;
    }

    public static int ocurrencias(int y, int[] z){
        int i = 0;
        int count = 0;

        while (i != z.length){
            if (z[i] == y){
                count = count + 1;
            }
            i++;
        }
        return count;
    }
}
