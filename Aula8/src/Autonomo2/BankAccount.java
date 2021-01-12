package Autonomo2;

import java.util.Scanner;

public abstract class BankAccount {

    private String password;
    private String accountNumber;
    private double balance;

    public BankAccount(String password, String accountNumber){
        this.accountNumber = accountNumber;
        this.password = password;
    }

    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);
    public abstract void extract();

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void changePassword(String newPassword){
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert your current password:");
        String currentPassword = input.next();
        if (password.equals(currentPassword)){
            setPassword(newPassword);
            System.out.println("Your password was changed successfully");
        } else {
            System.out.println("Incorrect password.");
        }
    }
}
