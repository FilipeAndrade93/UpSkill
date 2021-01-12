package Autonomo4;

public class Main {

    public static void main(String[] args) {
        Car teste = new Car("Volvo", 10000);

        System.out.println(teste.getCurrentFuel());
        teste.fillDeposit();
        System.out.println(teste.getCurrentFuel());
        System.out.println(teste.isOn());
        teste.turnOn();
        System.out.println(teste.isOn());
        teste.turnOff();
        System.out.println(teste.isOn());

    }
}
