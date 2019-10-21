package Bankapp;

import Bankapp.Bill;
import java.util.ArrayList;
import java.util.Scanner;

import static Bankapp.Users.replenishBalance;
import static Bankapp.Users.withdrawMoney;

public class Functions {

    public static Users createUser(String name, String surname, int id) {
        Users user = new Users(name, surname, id);
        user.setAccount(user.getAccount());
        return user;
    }

    public static String readDataFromConsole() {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        return s;
    }

    public static void showCurrentBillsBalance(ArrayList<Bill> billArrayList) {
        System.out.println("Сейчас у тебя вот столько денюжек:");

        for (Bill item : billArrayList) {
            System.out.println(Users.checkBalance(item));
        }
    }

    public static void modifyCurrentBillsBalance(ArrayList<Bill> billArrayList) {
        System.out.println("Скажи, человек, для чего я создан (добавить денюжек - добавить, подснять денюжек - подснять):");
        String operation = readDataFromConsole();
        switch (operation) {
            case "добавить":
                System.out.println("Сколько денюжек ты мне даешь:");
                for (Bill item : billArrayList) {
                    replenishBalance(Integer.parseInt(Functions.readDataFromConsole()), item);
                }
                break;
            case "подснять":
                System.out.println("А может лучше ты мне дашь? Ну, пажулуста! Ай! Ладно! Сколько тебе дать:");
                for (Bill item : billArrayList) {
                    withdrawMoney(Integer.parseInt(Functions.readDataFromConsole()), item);
                }
                break;
        }
    }
}
