public class Autonomo12 {

    public static void main(String[] args) {
        double result = areaPrisma(4, 3, 7);
        System.out.println(result);
    }

    public static double areaPrisma(double a, double b, double h){
        return 2 * a * b + 2 * a * h + 2 * b * h;
    }
}
