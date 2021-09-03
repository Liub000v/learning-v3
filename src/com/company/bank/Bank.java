package com.company.bank;
import com.company.bank.Client;

import java.util.HashMap;

public class Bank {
    HashMap<ClientId, Client> clientsId = new HashMap<>();

    Bank() {
        clientsId.put(new ClientId("Fred","Fabini"), new Client ("Fred","Fabini",9));
        clientsId.put(new ClientId("Bred","Babini"), new Client("Bred","Babini",8));
        clientsId.put(new ClientId("Dred","Dabini"), new Client("Dred","Dabini",3));
        clientsId.put(new ClientId("Vred","Vabini"),  new Client("Vred","Vabini", 10));
    }

    public void addClient(ClientId clientId, Client client) {
        clientsId.put(clientId, client);
    }

    public void getBalance(ClientId client) {
        if (clientsId.get(client)!=null){
            System.out.println(clientsId.get(client).getBalance());
        } else {
            System.out.println("Ошибка ввода");
        }
    }

    public void transfer(ClientId fromClient, ClientId toClient, int amount) {
        if (clientsId.get(fromClient)!=null && clientsId.get(toClient)!=null){
        clientsId.get(fromClient).withdrawal(amount);
        clientsId.get(toClient).deposit(amount);
        } else {
            System.out.println("Ошибка ввода");
        }
    }

    public void deleteClient(ClientId removeClient) {
        if (clientsId.get(removeClient)!=null){
        clientsId.remove(removeClient);
        } else{
            System.out.println("Ошибка ввода");
        }
    }

    public void printArray() {
        System.out.println(clientsId);
    }
}