package Exercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Por favor introduza um número:");

        int v = in.nextInt();

        System.out.println("O seu array é: " + Arrays.toString(naturals(v)));
    }

    public static int[] naturals(int a){
        int[] v = new int[a];
        int i = 0;
        int it = 0;

        while (i != v.length){
            v[i] = it + 1;
            it++;
            i++;
        }
        return v;
    }

}
