package DesignPatterns.Adapter.PaymentGw;

public interface PaymentAdapter {
    void openpayment();
    void openCheckStatus(String id);
}
