package com.company.bank;

import com.company.bank.Client;

import java.util.ArrayList;

public class Bank {
    ArrayList<Client> clientArraylist = new ArrayList();

    public void makeArray() {
        clientArraylist.add(new Client("Fred", "Fabini", 9));
        clientArraylist.add(new Client("Bred", "Babini", 8));
        clientArraylist.add(new Client("Dred", "Dabini", 3));
        clientArraylist.add(new Client("Vred", "Vabini", 10));
    }

    public void addClient(String name, String surname, int account) {
        clientArraylist.add(new Client(name, surname, account));
    }

    public void getBalance(String name, String surname) {
        for (Client client : clientArraylist) {
            if (client.getName().equals(name) && client.getSurname().equals(surname)) {
                System.out.println(client.getBalance());
            }
        }
    }

    public void transfer(String fromName, String fromSurname, String toName, String toSurname, int amount) {
        for (Client client : clientArraylist) {
            if (client.getName().equals(fromName) && client.getSurname().equals(fromSurname)) {
                client.withdrawal(amount);
            }
            if (client.getName().equals(toName) && client.getSurname().equals(toSurname)) {
                client.deposit(amount);
            }
        }
    }

    public void deleteClient(String name, String surname) {
        clientArraylist.removeIf(client -> client.getName().equals(name) && client.getSurname().equals(surname));
    }

    public void getArray() {
        for (Client client : clientArraylist) {
            System.out.println(client.getName() + " " + client.getSurname() + " " + client.getBalance());
        }
    }
}