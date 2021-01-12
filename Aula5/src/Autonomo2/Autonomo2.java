package Autonomo2;

import java.util.Arrays;

public class Autonomo2 {

    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {3, 4};

        int asize = a.length;
        int bsize = b.length;

        int[] merge = new int[asize + bsize];

        System.arraycopy(a, 0, merge, 0, asize);
        System.arraycopy(b, 0, merge, asize, bsize);
        System.out.println(Arrays.toString(merge));
    }
}
