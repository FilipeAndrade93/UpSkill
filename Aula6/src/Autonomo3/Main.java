package Autonomo3;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.sum(2, 2));
        System.out.println(calc.sum(5, 10));

        calc.printHistoric();
    }
}
