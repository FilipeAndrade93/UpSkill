package Autonomo3;

public class Main {

    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        Scientific calc2 = new Scientific();

        System.out.println(calc1.sum(1, 3));

        System.out.println(calc1.sub(2, 13));

        System.out.println(calc1.multiplication(2, 5));

        System.out.println(calc1.division(10, 3));

        System.out.println(calc2.power(2, 4));

        System.out.println(calc2.squareRoot(25));

    }
}
