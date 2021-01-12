package Exercicio2;

public class Exercicio2_2 {

    public static void main(String[] args) {

        int[] ar = new int[4];

        ar[0] = 3;
        ar[1] = 65;
        ar[2] = 98;
        ar[3] = 5;

        System.out.println(biggest(ar));
    }

    public static int biggest(int[] v){
        int max = v[0];
        for (int i = 1; i < v.length; i++){
            if (v[i] > max){
                max = v[i];
            }
        }
        return max;
    }
}