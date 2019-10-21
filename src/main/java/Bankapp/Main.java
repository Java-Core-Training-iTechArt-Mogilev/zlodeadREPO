package Bankapp;

import Bankapp.Functions;
import Bankapp.Bill;
import Bankapp.Users;

import java.util.ArrayList;

import static Bankapp.Functions.readDataFromConsole;

public class Main {

    public static void main(String[] args) {

        System.out.println("Как звать?");
        String name = readDataFromConsole();
        System.out.println("Чьих будешь?");
        String surname = readDataFromConsole();
        System.out.println("Мне впадлу, так что придумай себе номер сам!");
        int id = Integer.parseInt(readDataFromConsole());

        Users user = Functions.createUser(name, surname, id);

        System.out.println("В каких деньгах хочешь счет? (Рупь, Евро, Бакс):");
        Bill bill1 = user.createBill(readDataFromConsole());
        Bill bill2 = user.createBill(readDataFromConsole());
        Bill bill3 = user.createBill(readDataFromConsole());

        ArrayList<Bill> billArrayList = new ArrayList<Bill>();
        billArrayList.add(bill1);
        billArrayList.add(bill2);
        billArrayList.add(bill3);

        Functions.showCurrentBillsBalance(billArrayList);
        Functions.modifyCurrentBillsBalance(billArrayList);
        Functions.showCurrentBillsBalance(billArrayList);
        Functions.modifyCurrentBillsBalance(billArrayList);
        Functions.showCurrentBillsBalance(billArrayList);
    }
}
