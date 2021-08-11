package com.company.bank;

import com.company.bank.Client;
import com.company.bank.Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.makeArray();
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
                    String name1 = operation.nextLine();
                    System.out.println("Фамилия клиента: ");
                    String surname1 = operation.nextLine();
                    System.out.println("Баланс клиента: ");
                    int balance1 = Integer.parseInt(operation.nextLine());
                    bank.addClient(name1, surname1, balance1);
                    break;
                case "2":
                    System.out.print("Имя клиента: ");
                    String name2 = operation.nextLine();
                    System.out.println("Фамилия клиента: ");
                    String surname2 = operation.nextLine();
                    bank.getBalance(name2, surname2);
                    break;
                case "3":
                    System.out.print("Имя отправителя: ");
                    String fromName = operation.nextLine();
                    System.out.println("Фамилия отправителя: ");
                    String fromSurname = operation.nextLine();
                    System.out.print("Имя получателя: ");
                    String toName = operation.nextLine();
                    System.out.println("Фамилия получателя: ");
                    String toSurname = operation.nextLine();
                    System.out.println("Переводимые деньги: ");
                    int amount = Integer.parseInt(operation.nextLine());
                    bank.transfer(fromName, fromSurname, toName, toSurname, amount);
                    break;
                case "4":
                    System.out.print("Имя клиента: ");
                    String name4 = operation.nextLine();
                    System.out.println("Фамилия клиента: ");
                    String surname4 = operation.nextLine();
                    bank.deleteClient(name4, surname4);
                    break;
                case "5":
                    bank.getArray();
                    break;
                default:
                    i = 6;
            }
        }
        operation.close();
        bank.getArray();
    }
}
