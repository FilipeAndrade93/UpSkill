package Autonomo5;

public class Main {

    public static void main(String[] args) {
        CreditCard cc1 = new CreditCard("Filipe Andrade","123456789012", "1/21", 1000);

        System.out.println(cc1);

        cc1.payment(13.2);

        System.out.println(cc1);

        cc1.expense(13.2, "Esbelele");

        System.out.println(cc1);
    }
}
