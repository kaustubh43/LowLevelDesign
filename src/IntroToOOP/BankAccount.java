package IntroToOOP;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double balance;
    private String ownerName;
    private final List<String> transactionHistory;

    public BankAccount(){
        balance = 0;
        ownerName = "NoName";
        transactionHistory = new ArrayList<>();
    }

    public BankAccount(String name){
        balance = 0;
        ownerName = name;
        transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount){
        if(amount > 0) {
            setBalance(amount);
            transactionHistory.add("Owner:: " + ownerName + " Amount: " + amount + " deposited successfully");
            return;
        }
        System.out.println("Incorrect amount");
    }

    public void withdraw(double amount){
        if(amount <= getBalance() && amount > 0){
            setBalance(-amount);
            transactionHistory.add("Owner:: " + ownerName + " Amount " + amount + " withdrawn successfully");
            return;
        }
        System.out.println("Balance is not sufficient");
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double amount){
        balance = amount;
    }
    public void setOwnerName(String newName){
        ownerName = newName;
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }
}

