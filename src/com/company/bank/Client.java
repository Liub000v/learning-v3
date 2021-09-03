package com.company.bank;

public class Client {
    final String name;
    final String surname;
    private int balance;

    public Client(String name, String surname, int balance) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBalance() {
        return balance;
    }

    public void withdrawal(int amount) {
        balance = balance - amount;
    }

    public void deposit(int amount) {
        balance = balance + amount;
    }
    public String toString(){
        return " " + balance;
    }
}
