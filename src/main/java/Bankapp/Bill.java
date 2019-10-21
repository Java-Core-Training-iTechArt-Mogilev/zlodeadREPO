package Bankapp;

public class Bill {

    private double balance;
    private long account;

    public Bill(double balance, long account) {
        this.balance = balance;
        this.account = account;
    }

    public Bill() {
        this(0.0, 0);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String convertBalanceToString() {
        return Double.toString(getBalance());
    }
}
