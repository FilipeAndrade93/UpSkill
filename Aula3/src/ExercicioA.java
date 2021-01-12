public class ExercicioA {

    public static void main(String[] args) {
        int result = rounder(113.501);
        System.out.println(result);
    }

    public static int rounder(double a){
        int b = (int) a;
        if (a - b >= .5){
            return b + 1;
        } else {
            return b;
        }
    }
}
