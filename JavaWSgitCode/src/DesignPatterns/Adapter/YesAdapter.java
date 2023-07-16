package DesignPatterns.Adapter;

import DesignPatterns.Adapter.Banks.ICICI;
import DesignPatterns.Adapter.Banks.Yes;

public class YesAdapter implements OpenBank{

    Yes bank = new Yes();
    @Override
    public double getBalance() {
       return  bank.checkYesBal();
        //return 0;
    }

    @Override
    public void credit(double amount) {
        bank.depositinYes((int)amount);
    }

    @Override
    public void debit(double amount) {
        bank.withdrawFromYes((int)amount);
    }

}
