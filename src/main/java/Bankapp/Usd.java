package Bankapp;

public class Usd extends Bill {

    public Usd (double balance, long account) {
        super(balance, account);
    }

    @Override
    public String convertBalanceToString() {
        return Double.toString(getBalance()) + "Бакс";
    }
}
