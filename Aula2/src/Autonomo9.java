public class Autonomo9 {

    public static void main(String[] args) {
        double result = valorIva(100);
        System.out.println(result);
    }

    public static double valorIva(double a){
        double b = a / 1.23;
        return a - b;
    }
}
