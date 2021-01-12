package Autonomo1;

import java.util.Arrays;
import java.util.Scanner;

public class Autonomo1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduza o comprimento do seu array:");

        int c = in.nextInt();

        System.out.println("A metade do array com o comprimento seleccionado é: " + Arrays.toString(halfArray(c)));
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

    public static int[] halfArray(int y){
        int x = 0;
        int[] b = naturals(y);
        y = b.length - 1;

        if (y % 2 == 0){
            return Arrays.copyOfRange(b, x, y / 2);
        } else {
            return  Arrays.copyOfRange(b, x, (int) (y / 2 + 0.5));
        }
    }
}
