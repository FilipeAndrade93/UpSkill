public class Aula2 {

    public static void main(String[] args) {
        System.out.println(sumMult(2, 2, 2));
        System.out.println(multSum(2, 2, 2));
    }

    public static int sumMult (int a, int b, int c) {
        return (a + b) * c;
    }

    public static int multSum(int a, int b, int c){
        return a * b + c;
    }
}
