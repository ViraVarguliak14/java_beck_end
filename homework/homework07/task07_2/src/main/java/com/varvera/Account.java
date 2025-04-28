package com.varvera;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private ReentrantLock lock = new ReentrantLock();
    private final String iban;
    private final String owner;
    private double balance;

    public Account(String iban, String owner, double balance) {
        this.iban = iban;
        this.owner = owner;
        this.balance = balance;
    }

    public ReentrantLock getLock() {
        return lock;
    }

    public String getIban() {
        return iban;
    }

    public String getOwner() {
        return owner;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public boolean withdraw(double amount){
        if(getBalance()>=amount){
            balance-=amount;
            return true;
        }
        return false;
    }


    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }
}