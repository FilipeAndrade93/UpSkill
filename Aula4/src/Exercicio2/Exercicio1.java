package Exercicio2;

public class Exercicio1 {

    public static void main(String[] args) {
        int ar[] = new int[2];

        ar[0] = 3;
        ar[1] = 19;

        System.out.println(exists(3, ar));
    }

    public static boolean exists(int a, int[] v){

        for (int i = 0; i < v.length; i++){
            if (v[i] == a){
                return true;
            }
        } return false;
    }
}
