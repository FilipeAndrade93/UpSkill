package Autonomo2;

public class Main {

    public static void main(String[] args) {
        BankAccount a = new TransactionAccount("despacito", "1234567890");
        BankAccount b = new SavingsAccount("cu", "123456789", 1.2);

        a.deposit(1000);
        a.extract();
        a.withdraw(300);
        a.withdraw(800);

        System.out.println("----------------------------");

        b.deposit(3000);
        b.extract();
        b.withdraw(4000);
    }
}
