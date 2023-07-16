package DesignPatterns.Adapter.Banks;

public class Yes {
    public void depositinYes(int amount)
    {
        System.out.println( amount + " Depositing in Yes");
    }
    public int checkYesBal()
    {
        int balance =15000;
        System.out.println("Balance in yes  is " + balance);
        return balance;
    }
    public void  withdrawFromYes(int amount)
    {
        System.out.println(amount + " Withdwaing from Yes:");
    }
};
