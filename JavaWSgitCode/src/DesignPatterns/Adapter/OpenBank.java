package DesignPatterns.Adapter;

public interface OpenBank {

    public double getBalance();
    public void credit(double amount);
    public void debit(double amount);
}
