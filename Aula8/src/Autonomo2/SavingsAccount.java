package Autonomo2;

public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String password, String accountNumber, double interestRate) {
        super(password, accountNumber);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 0) {
            setBalance(getBalance() - amount);
            System.out.println("You have withdrawn " + amount + "€. Your current balance is " + getBalance() + "€");
        } else {
            System.out.println("Your balance is not sufficient to withdrawn that amount.");
        }
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Your deposit of " + amount + "€ was completed successfully. Your current balance is " + getBalance() + "€");
    }

    @Override
    public void extract() {
        System.out.println("Your balance is: " + (getBalance() * interestRate) + "€");
    }
}
