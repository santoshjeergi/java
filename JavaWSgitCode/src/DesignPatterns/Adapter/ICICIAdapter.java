package DesignPatterns.Adapter;

import DesignPatterns.Adapter.Banks.ICICI;

public class ICICIAdapter implements OpenBank{

    ICICI bank = new ICICI();
    @Override
    public double getBalance() {
        return bank.checkIciciBal();
        //return 0;
    }

    @Override
    public void credit(double amount) {
        bank.depositinIcici((int)amount);
    }

    @Override
    public void debit(double amount) {
        bank.withdrawFromIcici((int)amount);
    }

}
