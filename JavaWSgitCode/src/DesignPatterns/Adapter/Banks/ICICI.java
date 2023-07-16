package DesignPatterns.Adapter.Banks;

public class ICICI {
    public void depositinIcici(int amount)
    {
        System.out.println( amount + " Depositing in icici");
    }
    public int checkIciciBal()
    {
        int balance =5000;
        System.out.println("Balance in icici is " + balance);
        return balance;
    }
    public void withdrawFromIcici(int amount)
    {
        System.out.println(amount + " Withdwaing from Icici:");

    }
};
