public class Autonomo6 {

    public static void main(String[] args) {
        double result = fahr(37.5);
        System.out.println(result);
    }

    public static double fahr(double a){
        return a * 1.8 + 32;
    }
}
