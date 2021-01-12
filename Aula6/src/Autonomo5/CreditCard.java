package Autonomo5;

import java.util.Arrays;

public class CreditCard {

    private String cardHolder;
    private String cardNumber;
    private String validity;
    private double plafond;
    private double totalExpense;
    private String[] movements;
    private int indexMovements;

    public CreditCard(String cardHolder, String cardNumber, String validity, double plafond){
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
        this.validity = validity;
        this.plafond = plafond;
        this.totalExpense = 0;
        this.indexMovements = 0;
        this.movements = new String[100];
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getValidity() {
        return validity;
    }

    public double getPlafond() {
        return plafond;
    }

    public void setPlafond(double plafond) {
        this.plafond = plafond;
    }

    public double balance(){
        double balance = getPlafond() - totalExpense;
        return balance;
    }

    public void payment(double value){
        movements[indexMovements] = value + " -  Payment";
        indexMovements++;
        totalExpense =- value;
    }

    public void expense(double value, String description){
        totalExpense += value;
        movements[indexMovements] = value + " - "  + description;
        indexMovements++;
    }

    public String lastTransaction(){
        return movements[indexMovements - 1];
    }

    public void allTransactions(){
        for (int i = 0; i < indexMovements; i++){
            System.out.println(movements[i]);
        }
    }

    @Override
    public String toString() {
        return "Card holder: " + cardHolder + " / " + "Plafond: " + plafond + " / " + "Balance: " + balance();
    }
}
