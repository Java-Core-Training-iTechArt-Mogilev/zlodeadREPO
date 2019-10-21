package Bankapp;

public class Eur extends Bill {

    public Eur(double balance, long account) {
        super(balance, account);
    }

    @Override
    public String convertBalanceToString() {
        return Double.toString(getBalance()) + "Евро";
    }
}
