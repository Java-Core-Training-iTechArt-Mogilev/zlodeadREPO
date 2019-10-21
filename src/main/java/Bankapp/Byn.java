package Bankapp;

public class Byn extends Bill {

    public Byn(double balance, long account) {
        super(balance, account);
    }

    @Override
    public String convertBalanceToString() {
        return Double.toString(getBalance()) + "Рупь";
    }
}
