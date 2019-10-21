package Bankapp;

public class Users {

    private String firstname;
    private String lastname;
    private long account;

    Users(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.account = 0;
    }

    public Users(String firstname, String lastname, long account) {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setName(String name) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setSurname(String surname) {
        this.lastname =lastname;
    }

    public long getAccount() {
        return account;
    }

    public Users Users (long account) {
        this.account = account;
        return this;
    }

    public Bill createBill(String currency) {

        Bill bill = new Bill();
        switch (currency) {
            case ("Рупь"):
                bill = new Byn(0.0, this.account);
                break;
            case ("Евро"):
                bill = new Eur(0.0, this.account);
                break;
            case ("Бакс"):
                bill = new Usd(0.0, this.account);
                break;
        }
        return bill;
    }

    public static String checkBalance(Bill bill) {
        return bill.convertBalanceToString();
    }

    public static void replenishBalance(double sum, Bill bill) {
        double currentBalance = bill.getBalance();
        bill.setBalance(currentBalance += sum);
    }

    public static void withdrawMoney(double sum, Bill bill) {
        double currentBalance = bill.getBalance();
        if (sum > currentBalance) {
            bill.setBalance(0.0);
        } else {
            bill.setBalance(currentBalance -= sum);
        }
    }

    public void setAccount(long account) {
    }
}
