package io.zipcoder;

import java.util.ArrayList;

public abstract class Account {
    private Object accountHolder;
    private Double balance;
    private String accountNumber;
     
    // TODO: Add a field to track transactions
    private ArrayList<String> transactionHistory;

    public Account(Object accountHolder, Double balance, String accountNumber) {
        // TODO: Implement constructor
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.transactionHistory = new ArrayList<>();
    }

    public Object getAccountHolder() {
        // TODO: Implement getter
        return accountHolder;
    }

    public Double getBalance() {
        // TODO: Implement getter
        return balance;
    }

    public void setBalance(Double balance) {
        // TODO: Implement setter
        this.balance = balance;
    }

    public String getAccountNumber() {
        // TODO: Implement getter
        return accountNumber;
    }

    public void credit(Double amount) {
        // TODO: Implement credit method (add money to account)
        // TODO: Record this transaction
        if (amount > 0) {
            this.balance += amount;

            transactionHistory.add("Credit: +" + amount + " | New Balance: " + this.balance);
        }
        else {
                throw new IllegalArgumentException("Credit amount must be positive");
            }
        }

    public void debit(Double amount) {
        // TODO: Implement debit method (remove money from account)
        // TODO: Record this transaction
        if (amount > 0) {
            this.balance -= amount;
            transactionHistory.add("Debit: -" + amount + " | New Balance: " + this.balance);
            System.out.println("New Balance " + this.balance);
        }
        else {
            throw new IllegalArgumentException("Debit amount must be positive");
        } 
        
    }

    public Object getTransactions() {
        // TODO: Implement method to return transaction history
        return transactionHistory;
    }
}

