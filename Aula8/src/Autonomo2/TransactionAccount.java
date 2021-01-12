package Autonomo2;

public class TransactionAccount extends BankAccount {

    private int transactionsAmount;

    public TransactionAccount(String password, String accountNumber) {
        super(password, accountNumber);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 0) {
            setBalance(getBalance() - amount);
            transactionsAmount++;
            System.out.println("You have withdrawn " + amount + "€. Your current balance is " + getBalance() + "€");
        } else {
            System.out.println("Your balance is not sufficient to withdrawn that amount.");
        }
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Your deposit of " + amount + "€ was completed successfully. Your current balance is " + getBalance() + "€");
        transactionsAmount++;
    }

    @Override
    public void extract() {
        System.out.println("Your balance is: " + getBalance() + "€");
    }
}
