package DesignPatterns.Adapter.PaymentGw;

public class PayPal {

    void pPayment()
    {
        System.out.println("PayPal payment");
    }

    void pCheckStatus(String id)
    {
        System.out.println("PayPal check status for " + id);
    }
}
