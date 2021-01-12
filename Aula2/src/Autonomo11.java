public class Autonomo11 {

    public static void main(String[] args) {
        double result = perimetro(18);
        System.out.println(result);
    }

    public static double perimetro(double a){
        double r = a / 2;
        return 2 * Math.PI * r;
    }
}
