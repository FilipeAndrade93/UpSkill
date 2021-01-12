package Exercicio7;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner in = new Scanner(System.in);

        System.out.println("Introduz o limite  mínimo (0 - 10):");

        int n1 = in.nextInt();

        System.out.println("Introduz o limite máximo (0 - 10):");

        int n2 = in.nextInt();

        if (n1 > n2 || n1 == n2){
            System.out.println("O limite mínimo não pode ser maior ou igual que o máximo. Tenta de  novo.");
        } else if (n1 < 0 && n2 > 10){
            System.out.println("Os limites não podem ser maiores ou menores que os do array. ");
        } else {
            System.out.println("O sub-vector criado a partir do vector " + Arrays.toString(v) + " é " + Arrays.toString(limiter(v, n1, n2)));
        }
    }

    public static int[] limiter(int[] x, int y, int z){

        return Arrays.copyOfRange(x, y, z);
    }
}
