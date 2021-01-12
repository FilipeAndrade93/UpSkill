package Autonomo10;

import  java.util.Scanner;
import java.util.Arrays;

public class Autonomo10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Introduz 3 algarismos:");

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int[] group = {a, b, c};

        Arrays.sort(group);

        System.out.println("Ordem crescente: " + Arrays.toString(group));
    }
}
