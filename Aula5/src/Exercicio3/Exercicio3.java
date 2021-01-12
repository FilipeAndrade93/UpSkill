package Exercicio3;

import java.util.Arrays;

public class Exercicio3 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numbers(50)));
    }

    public static int[] numbers(int a){
        int[] v = new int[a];
        int i = 0;
        int min = 101;

        while (i != v.length){
            v[i] = min;
            i++;
            min++;
        }
        return v;
    }
}
