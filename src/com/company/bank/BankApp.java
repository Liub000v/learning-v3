package com.company.bank;

import com.company.bank.Client;
import com.company.bank.Bank;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner operation = new Scanner(System.in);
        for (int i = 0; i < 1; ) {
            System.out.println("Введите номер операции:\n"
                    + "1 Добавить клиента\n"
                    + "2 Вывести счет клиента\n"
                    + "3 Перевести деньги\n"
                    + "4 Закрыть счет\n"
                    + "5 Вывести всех клиентов\n"
                    + "6 Закончить");
            String numberOperation = operation.nextLine();
            switch (numberOperation) {
                case "1":
                    System.out.print("Имя клиента: ");
                    String name = operation.nextLine();
                    System.out.println("Фамилия клиента: ");
                    String surname = operation.nextLine();
                    ClientId clientId = new ClientId(name, surname);
                    System.out.println("Баланс клиента: ");
                    int balance = Integer.parseInt(operation.nextLine());
                    Client client = new Client(name, surname, balance);
                    bank.addClient(clientId, client);
                    break;
                case "2":
                    System.out.print("Имя клиента: ");
                    String name1 = operation.nextLine();
                    System.out.println("Фамилия клиента: ");
                    String surname1 = operation.nextLine();
                    ClientId client1 = new ClientId(name1, surname1);
                    bank.getBalance(client1);
                    break;
                case "3":
                    System.out.print("Имя отправителя: ");
                    String fromName = operation.nextLine();
                    System.out.println("Фамилия отправителя: ");
                    String fromSurname = operation.nextLine();
                    ClientId fromClient = new ClientId(fromName, fromSurname);
                    System.out.print("Имя получателя: ");
                    String toName = operation.nextLine();
                    System.out.println("Фамилия получателя: ");
                    String toSurname = operation.nextLine();
                    ClientId toClient = new ClientId(toName, toSurname);
                    System.out.println("Переводимые деньги: ");
                    int amount = Integer.parseInt(operation.nextLine());
                    bank.transfer(fromClient, toClient, amount);
                    break;
                case "4":
                    System.out.print("Имя клиента: ");
                    String name4 = operation.nextLine();
                    System.out.println("Фамилия клиента: ");
                    String surname4 = operation.nextLine();
                    ClientId removeClient = new ClientId(name4, surname4);
                    bank.deleteClient(removeClient);
                    break;
                case "5":
                    bank.printArray();
                    break;
                default:
                    i = 6;
            }
        }
        operation.close();
        bank.printArray();
    }
}
